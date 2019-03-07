package az.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingListTest {

    private Shop list;

    @Before
    public void setUp() throws Exception {
        list = new Shop();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalcPaymentAmount() {
        int result = list.calcPaymentAmount(1, 2);
        double amount = 0;
        double itemPrice = 0;
        //Assert.assertEquals((amount * itemPrice), amount, itemPrice);
        Assert.assertEquals(2, result);
    }

}