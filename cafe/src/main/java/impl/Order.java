package impl;

import modeling.IOrder;

/**
 * Created by jinwoopark on 2017. 8. 1..
 */
public class Order {
    private Menu menu;
    private String c_Num;
    public Order(Menu menu, String c_Num){
        this. menu = menu;
        this.c_Num = c_Num;
    }

    public Menu getMenu(){
        return this.menu;
    }

    public String getC_Num(){
        return this.c_Num;
    }
}
