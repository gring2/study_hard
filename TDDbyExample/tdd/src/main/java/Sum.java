public class Sum implements Expression{
    Money augend;
    Money addend;

    public Sum(Money money, Money added) {

        augend = money;
        addend = added;
    }

    public Money reduce(String to){
        int amount = augend.amount + addend.amount;

        return new Money(amount, to);
    }
}
