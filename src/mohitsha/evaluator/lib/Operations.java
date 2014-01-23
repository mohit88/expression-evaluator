package mohitsha.evaluator.lib;

public class Operations {

    protected double addTwoNumbers(double firstNo, double secondNo){
        return firstNo + secondNo;
    }


    protected double subtractTwoNumbers(double firstNo, double secondNo){
        return firstNo - secondNo;
    }

    protected double multiplyTwoNumbers(double firstNo, double secondNo){
        return firstNo * secondNo;
    }

    protected double getQuotient(double firstNo, double secondNo){
        double output = firstNo / secondNo;
        return output;
    }

    protected long getExponential(double firstNo, double secondNo){
        long result = (long) Math.pow(firstNo, secondNo);
        return  result;
    }

}
