package mohitsha.evaluator.lib;

import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void testEvaluateDivisionOfPositiveTwoOperands() throws Exception {
        String expression = "10/5";
        String expected = "2";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateExponentialOfTwoPositiveOperands() throws Exception {
        String expression = "10^2";
        String expected = "100";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateAdditionOfTwoPositiveDecimalOperands() throws Exception {
        String expression = "10+2.3";
        String expected = "12.3";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateSubtractionOfTwoPositiveDecimalOperands() throws Exception {
        String expression = "2.3-10";
        String expected = "-7.7";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiplicationOfTwoPositiveDecimalOperands() throws Exception {
        String expression = "2.3*10";
        String expected = "23";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivisionOfTwoPositiveDecimalOperands() throws Exception {
        String expression = "10/2.5";
        String expected = "4";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testExponentialOfTwoPositiveDecimalOperands() throws Exception {
        String expression = "0.2^1";
        String expected = "0.2";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateSimpleExpressionWithSpaces() throws Exception {
        String expression = " 4 + 5 ";
        String expected = "9";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateExpressionWithMultipleOperatorsOfAddition() throws Exception {
        String expression = "4+5+6";
        String expected = "15";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateExpressionWithMultipleOperatorsOfSubtraction() throws Exception {
        String expression = "4-5-6";
        String expected = "-7";

        String actual = new EvaluatorLib().evaluate(expression);

        Assert.assertEquals(expected, actual);
    }

}
