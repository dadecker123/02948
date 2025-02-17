import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {
    @Test
    public void testMain() {
        Temperature temperature = new Temperature();
        double celsius = 37;
        double actualResult = (9.0 / 5) * celsius + 32;
        Assert.assertEquals(98.60000000000001,actualResult , 0);

    }
}
