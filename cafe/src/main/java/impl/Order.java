package impl;

import modeling.IOrder;

/**
 * Created by jinwoopark on 2017. 8. 1..
 */
public class Order implements IOrder {
    private String menu;
    private String c_Num;
    public Order(String menu, String c_Num){
        this. menu = menu;
        this.c_Num = c_Num;
    }

    public String getMenu(){
        return this.menu;
    }

    public String getC_Num(){
        return this.c_Num;
    }
}
