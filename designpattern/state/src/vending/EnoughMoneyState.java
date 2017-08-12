package vending;

/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class EnoughMoneyState implements State{
    private VendingMachine machine;
    public EnoughMoneyState(VendingMachine vendingMachine) {
        this.machine = vendingMachine;
    }

    @Override
    public void insertCoin(int money) {
        machine.getMoneyBox().insert(money);
        System.out.println(money + "is inserted");
        System.out.println("Money inserted is " + machine.getMoneyBox().getMoney());

    }

    @Override
    public void pushButton(int price) {
        machine.getMoneyBox().dispense(price);
        machine.getDrinking().dispense();
        System.out.println("Drink is dispensed");
        if(machine.getDrinking().getStock() <=0){
            machine.setState(machine.getSoldOutState());
        }
        else if(machine.getMoneyBox().getMoney() < machine.getDrinking().getPrice()){
            machine.setState(machine.getNoEnoughMoneyState());
        }
        else if(machine.getMoneyBox().getMoney() == 0 ){
            machine.setState(machine.getNoMoneyState());
        }
        else{
            machine.setState(machine.getEnoughMoneyState());
        }
    }


    @Override
    public void returnCoin() {
        int tmp = machine.getMoneyBox().getMoney();
        System.out.println(tmp + " is returned");
        machine.setState(machine.getNoMoneyState());

    }
}
