package rental;

/**
 * Created by jinwoopark on 2017. 8. 6..
 */
public class MemberDiscount implements DiscountStrategy{
    @Override
    public int discount(int price, int quantity) {
        return (int) (price * quantity * 0.9);
    }
}
