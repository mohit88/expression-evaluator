import junit.framework.Assert;
import lib.SampleMethod;
import org.junit.Test;

public class SampleMethodTest {
    @Test
    public void testIsItWorking() throws Exception {
        String check = "false";

        boolean actual = new SampleMethod().isItWorking(check);

        Assert.assertFalse(actual);
    }
}
