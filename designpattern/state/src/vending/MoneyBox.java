package vending;

/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class MoneyBox {

    private int money = 0;

    public int getMoney(){
        return this.money;
    }

    public void insert(int money){
        this.money += money;
    }

    public void dispense(int price){
        this.money -= price;
    }

    public int returnmoney(){
        int tmp = this.money;
        this.money =0 ;
        return tmp;
    }
}
