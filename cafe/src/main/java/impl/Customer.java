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

    public Customer(String c_Num){
        this.c_Num = c_Num;
    }
    @Override
    public IOrder makeOrder(String menuName) throws NullPointerException{

        IOrder order = null;
        try{
            Menu optional = Menu.valueOf(menuName);
            order = new Order(optional.name(), this.c_Num);

        }catch (Exception e){
            throw new NullPointerException();

        }


        return order;
    }

    @Override
    public void requireList(IBarista barista) {

    }

    @Override
    public int payMoney(Map served) {
        return 0;
    }

    public String getC_Num(){
        return this.c_Num;
    }
}
