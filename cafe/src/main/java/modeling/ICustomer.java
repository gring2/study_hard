package modeling;

import impl.Menu;

import java.util.Map;

/**
 * Created by jinwoopark on 2017. 7. 31..
 */
public interface ICustomer {
//
//  String c_Num;

    IOrder makeOrder(String menu_num);

    void requireList(IBarista barista);

    int payMoney(Map served);


}
