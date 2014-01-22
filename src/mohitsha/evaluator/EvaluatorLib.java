package mohitsha.evaluator;

import java.util.LinkedList;
import java.util.List;

public class EvaluatorLib {
    private int addTwoNumbers(int firstNo ,int secondNo){
        Integer result = firstNo + secondNo;
        return result;
    }
    private int subtractTwoNumbers(int firstNo ,int secondNo){
        Integer result = firstNo - secondNo;
        return result;
    }
    private int multiplyTwoNumbers(int firstNo ,int secondNo){
        Integer result = firstNo * secondNo;
        return result;
    }
    private double getQuotient(int firstNo, int secondNo){
        Integer result = firstNo / secondNo;
        return result;
    }
    private int getExponential(int firstNo ,int secondNo){
        double result = Math.pow(firstNo, secondNo);
        return (int) result;
    }

    public String evaluate(String expression){
        String[] listOfNos = expression.split("[+*/^-]");
        String[] listOfOperators = expression.split("\\d+");

        int firstNo = Integer.parseInt(listOfNos[0]);
        int secondNo = Integer.parseInt(listOfNos[1]);
        String operator = listOfOperators[1];

        String output = "";

        if(operator.equals("+"))
            output = String.valueOf(addTwoNumbers(firstNo, secondNo));
        if(operator.equals("-"))
            output = String.valueOf(subtractTwoNumbers(firstNo, secondNo));
        if(operator.equals("*"))
            output = String.valueOf(multiplyTwoNumbers(firstNo, secondNo));
        if(operator.equals("/"))
            output = String.valueOf(getQuotient(firstNo, secondNo));
        if(operator.equals("^"))
            output = String.valueOf(getExponential(firstNo, secondNo));

        return output;
    }
}
