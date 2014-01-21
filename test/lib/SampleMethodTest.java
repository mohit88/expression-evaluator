package lib;


import org.junit.Assert;
import org.junit.Test;

public class SampleMethodTest {
    @Test
    public void testIsItWorking() throws Exception {
        String check = "true";

        boolean actual = new SampleMethod().isItWorking(check);

        Assert.assertTrue(actual);
    }

    @Test
    public void testBuildisWorking() throws Exception {
        String check = "false";

        boolean actual = new SampleMethod().isItWorking(check);

        Assert.assertFalse(actual);
    }
}
