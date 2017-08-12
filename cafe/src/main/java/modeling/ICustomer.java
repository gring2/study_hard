package modeling;

import impl.Menu;
import impl.Order;

import java.util.Map;

/**
 * Created by jinwoopark on 2017. 7. 31..
 */
public interface ICustomer {
//
//  String c_Num;

    Order makeOrder(String menu_num);


    int payMoney();


}
