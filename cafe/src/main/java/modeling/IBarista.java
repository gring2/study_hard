package modeling;

import impl.Order;

import java.util.Map;

/**
 * Created by jinwoopark on 2017. 7. 31..
 */
public interface IBarista {

//    IMenu[] menulist
//        Queue orderQueye

    void takeOrder(Order c_order);


    ICoffee makeCoffee();
     ICoffee serving(Order coffee);
    boolean getMoney(int money, String c_Num);
}
