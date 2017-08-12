package impl;

/**
 * Created by jinwoopark on 2017. 8. 1..
 */
public enum Menu {
    Espresso("Espresso", 100),
    Americano("Americano",200), CafeLatte("CafeLatte",300), Cappuccino("Cappuccino",400);
    public String name;
    public int price;
    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
