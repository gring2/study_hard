package impl;

import modeling.IBarista;
import modeling.ICoffee;

import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by jinwoopark on 2017. 8. 1..
 */
public class Barista implements IBarista{
    private static Barista barista = new Barista();
    Queue<Order> orderList;
    LinkedList<Order> served;
    private Barista(){
        orderList = new LinkedList<>();
        served = new LinkedList<>();

    }
    public Barista getInstance(){
        return barista;
    }
    @Override
    public void takeOrder(Order c_order) {
        orderList.add(c_order);
    }



    @Override
    public ICoffee makeCoffee() {
        Order o = orderList.remove();
        ICoffee stuff = this.serving(o);
        served.add(o);
        return stuff;
    }

    @Override
    public ICoffee serving(Order coffee) {
        Coffee stuff = new Coffee(coffee.getMenu().name);
        return stuff;
    }

    @Override
    public boolean getMoney(int money, String c_Num) {
        for (Order order :
                served) {
            if (order.getC_Num().equals(c_Num) && order.getMenu().price == money) {
                System.out.println("thank you");
                served.remove(order);
                return true;
            }
        }
            System.out.println("not correct payment");
            return false;
    }
}
