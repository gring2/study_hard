package rental;

/**
 * Created by jinwoopark on 2017. 8. 6..
 */
public class Ordinary implements DiscountStrategy{
    @Override
    public int discount(int price, int quantity) {
        return price * quantity;
    }
}
