package lib;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by mohitsha on 1/20/14.
 */
public class SampleMethodTest {
    @Test
    public void testIsItWorking() throws Exception {
        String check = "false";

        boolean actual = new SampleMethod().isItWorking(check);

        Assert.assertFalse(actual);
    }
}