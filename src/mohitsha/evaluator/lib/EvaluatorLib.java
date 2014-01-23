package mohitsha.evaluator.lib;

import java.beans.Expression;

public class EvaluatorLib {

    public String evaluate(String expression){

        expression = expression.replaceAll("\\s","");
        String[] listOfNos = expression.split("[+*/^-]");
        String[] listOfOperators = expression.split("[.0-9]+");

        double firstNo = Double.parseDouble(listOfNos[0]);
        double secondNo = Double.parseDouble(listOfNos[1]);

        String operator = listOfOperators[1];

        String output = "";

        output = String.valueOf(new Operations().decideOperation(operator,firstNo,secondNo));

        return output.replaceAll("\\.0$","");
    }
}
