package vending;

/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public interface State {

    void insertCoin(int money);
    void pushButton(int price);
    void returnCoin();
}
