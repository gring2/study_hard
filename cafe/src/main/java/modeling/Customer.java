package modeling;

import java.util.Map;

/**
 * Created by jinwoopark on 2017. 7. 31..
 */
public interface Customer {
//
//  String c_Num;

    Order makeOrder();

    void requireList(Barista barista);

    int payMoney(Map served);


}
