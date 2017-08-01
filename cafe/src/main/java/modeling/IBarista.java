package modeling;

import java.util.Map;

/**
 * Created by jinwoopark on 2017. 7. 31..
 */
public interface IBarista {

//    IMenu[] menulist
//        Queue orderQueye

    void takeOrder(Map c_order);


    ICoffee makeCoffee(String menu);
    Map  serving(ICoffee coffee);
    void getMoney(int money);
}
