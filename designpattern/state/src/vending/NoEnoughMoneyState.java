package vending;

/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class NoEnoughMoneyState implements State {
    private VendingMachine vendingMachine;
    public NoEnoughMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int money) {
        this.vendingMachine.getMoneyBox().insert(money);

        if(vendingMachine.getDrinking().getPrice() <= vendingMachine.getMoneyBox().getMoney()){
            vendingMachine.setState(vendingMachine.getEnoughMoneyState());
        }

        else {
            vendingMachine.setState(vendingMachine.getNoEnoughMoneyState());
        }
        System.out.println("Money inserted is " + vendingMachine.getMoneyBox().getMoney());
    }

    @Override
    public void pushButton(int price) {
        System.out.println("Not Enough money");
    }


    @Override
    public void returnCoin() {
        int tmp = vendingMachine.getMoneyBox().getMoney();
        System.out.println(tmp + " is returned");
        vendingMachine.setState(vendingMachine.getNoMoneyState());
    }
}
