package impl;

import modeling.IBarista;
import modeling.ICoffee;

import java.util.Map;

/**
 * Created by jinwoopark on 2017. 8. 1..
 */
public class Barista implements IBarista{

    public Barista(){

    }
    @Override
    public void takeOrder(Map c_order) {

    }



    @Override
    public ICoffee makeCoffee(String menu) {
        return null;
    }

    @Override
    public Map serving(ICoffee coffee) {
        return null;
    }

    @Override
    public void getMoney(int money) {

    }
}
