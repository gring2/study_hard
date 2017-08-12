package vending;

/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class Drinking {
    private int stock;
    private int price;

    public Drinking(int stock, int price) {
        this.price = price;
        this.stock = stock;
    }
    public void dispense(){
        this.stock--;
    }
    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

}
