package impl;

import modeling.IBarista;
import modeling.ICustomer;
import modeling.IOrder;

import java.util.Map;
import java.util.Optional;

/**
 * Created by jinwoopark on 2017. 8. 1..
 */
public class Customer implements ICustomer{
    private String c_Num;
    private Menu menu;

    public Customer(String c_Num){
        this.c_Num = c_Num;
    }

    @Override
    public Order makeOrder(String menuName) throws NullPointerException{

        Order order = null;
        try{
            Menu optional = Menu.valueOf(menuName);
            order = new Order(optional, this.c_Num);
            this.menu = optional;
        }catch (Exception e){
            throw new NullPointerException();
        }

        return order;
    }

    @Override
    public int payMoney() {
        return menu.price;
    }

    public String getC_Num(){
        return this.c_Num;
    }
}
