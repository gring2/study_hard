package vending;

/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class Client {

    public static void main(String[] args){
        VendingMachine machine = new VendingMachine(5, 1000);
        machine.insertMoney(1000);
        machine.insertMoney(500);
        machine.pushButton();
        machine.returnMoeny();
        machine.insertMoney(500);
        machine.pushButton();
        machine.insertMoney(1000);
        machine.pushButton();

    }
}
