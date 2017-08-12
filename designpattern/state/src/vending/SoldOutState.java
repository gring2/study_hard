package vending;

/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class SoldOutState implements State {
    private VendingMachine machine;
    public SoldOutState(VendingMachine vendingMachine) {
        this.machine = vendingMachine;
    }

    @Override
    public void insertCoin(int money) {
        System.out.println("Sold OUt");
    }

    @Override
    public void pushButton(int price) {

    }

    @Override
    public void returnCoin() {
        int tmp = machine.getMoneyBox().getMoney();
        System.out.println(tmp + " is returned");
        machine.setState(machine.getNoMoneyState());

    }
}
