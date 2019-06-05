public class Sum implements Expression{
    Expression augend;
    Expression addend;

    Sum(Expression money, Expression added) {

        augend = money;
        addend = added;
    }

    public Money reduce(Bank bank, String to){
        int amount = augend.reduce(bank,to).amount + addend.reduce(bank, to).amount;

        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }
}
