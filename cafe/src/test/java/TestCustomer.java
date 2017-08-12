import impl.Barista;
import impl.Customer;
import impl.Menu;
import impl.Order;
import modeling.ICustomer;
import org.junit.*;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * Created by jinwoopark on 2017. 8. 1..
 */
public class TestCustomer {
    private Customer customer;
    @Before
    public void createCustomer() throws Exception {
        customer = new Customer("01");
        ICustomer x = new Customer("22");
    }
    @Test
    public void testOrderOnRightValue() {
        assertEquals(Menu.valueOf("Espresso")
                ,customer.makeOrder("Espresso").getMenu());
    }

    @Test
    public void testPayValue() {
        customer.makeOrder("Espresso");
        assertEquals(Menu.valueOf("Espresso").price
                ,customer.payMoney());
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
