package mohitsha.evaluator;

import java.util.LinkedList;
import java.util.List;

public class EvaluatorLib {
    private String addTwoNumbers(String firstNo ,String secondNo){
        Integer result = Integer.parseInt(firstNo) + Integer.parseInt(secondNo);
        return result.toString();
    }
    private String subtractTwoNumbers(String firstNo ,String secondNo){
        Integer result = Integer.parseInt(firstNo) - Integer.parseInt(secondNo);
        return result.toString();
    }

    private String multiplyTwoNumbers(String firstNo ,String secondNo){
        Integer result = Integer.parseInt(firstNo) * Integer.parseInt(secondNo);
        return result.toString();
    }



    public String evaluate(String expression){
        String[] listOfNos = expression.split("[+*-]");
        String[] listOfOperators = expression.split("\\d+");

        String output = "";

        if(listOfOperators[1].equals("+"))
            output = addTwoNumbers(listOfNos[0], listOfNos[1]);
        if(listOfOperators[1].equals("-"))
            output = subtractTwoNumbers(listOfNos[0], listOfNos[1]);
        if(listOfOperators[1].equals("*"))
            output = multiplyTwoNumbers(listOfNos[0], listOfNos[1]);

        return output;
    }
}
