package mohitsha.evaluator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mohitsha on 1/22/14.
 */
public class EvaluatorLibTest {
    @Test
    public void testEvaluateSimpleAdditionOfPositiveTwoOperands() throws Exception {
        String expression = "4+5";
        String expected = "9";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEvaluateSubtractionOfPositiveTwoOperands() throws Exception {
        String expression = "8-5";
        String expected = "3";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateMultiplyOfPositiveTwoOperands() throws Exception {
        String expression = "8*5";
        String expected = "40";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

}
