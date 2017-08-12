package vending;

/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class NoMoneyState implements State {

    private VendingMachine vendingMachine;
    public NoMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int money) {
        vendingMachine.getMoneyBox().insert(money);
        System.out.println("Money inserted");

        if(money >= vendingMachine.getDrinking().getPrice()){
            vendingMachine.setState(vendingMachine.getEnoughMoneyState());
        }
        else{
            vendingMachine.setState(vendingMachine.getNoEnoughMoneyState());
        }
        System.out.println("Money inserted is " + vendingMachine.getMoneyBox().getMoney());

    }

    @Override
    public void pushButton(int price) {
        System.out.println("PLease insert money");
    }

    @Override
    public void returnCoin() {
        System.out.println("No money");
    }
}
