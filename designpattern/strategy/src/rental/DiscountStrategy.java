package rental;

/**
 * Created by jinwoopark on 2017. 8. 6..
 */
public interface DiscountStrategy {
    int discount(int price, int quantity);
}
