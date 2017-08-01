package modeling;

import java.util.Map;
import java.util.Queue;

/**
 * Created by jinwoopark on 2017. 7. 31..
 */
public interface Barista {

//    Menu[] menulist
//        Queue orderQueye

    void takeOrder(Map c_order);

    Menu[] giveList();

    Coffee makeCoffee(Menu menu);
    Map  serving(Coffee coffee);
    void getMoney(int money);
}
