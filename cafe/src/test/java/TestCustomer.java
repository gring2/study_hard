import impl.Customer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by jinwoopark on 2017. 8. 1..
 */
public class TestCustomer {
    private Customer customer;
    @Before
    public void createCustomer() throws Exception {
        customer = new Customer("01");

    }
    @Test(expected = NullPointerException.class)
    public void testOrderOnRightValue() {
        assertNotNull(customer.makeOrder("Espresso"));
        assertNull(customer.makeOrder(null));
        assertNull(customer.makeOrder("Espresso2"));
    }
    @Test(expected = NullPointerException.class)
    public void testOrderOnWrongValue() {
        assertNull(customer.makeOrder("Espresso2"));
    }
    @Test(expected = NullPointerException.class)
    public void testOrderOnNullValue() {
        assertNull(customer.makeOrder(null));
    }

}
