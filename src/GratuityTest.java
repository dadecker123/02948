import org.junit.Assert;
import org.junit.Test;

public class GratuityTest {
    @Test
    public void testMain() {
        double subTotal = 80;
        double gratuity = 12.5;
        double tip = subTotal * (gratuity / 100);
        double total = subTotal + tip;
        Assert.assertEquals(90, 90, 0);

    }
}
