package mohitsha.evaluator.lib;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EvaluatorLib {

    List<String> createList(String[] elements){
        List<String> outputList = new LinkedList<String>();

        Collections.addAll(outputList, elements);

        return outputList;
    }

    private String evalExpressionWithMultipleOperators(List<String> listOfNos, List<String> listOfOperators){

        if(listOfNos.size() < 2) return String.valueOf(Double.parseDouble(listOfNos.get(0).trim()));

        double firstNo = Double.parseDouble(listOfNos.get(0).trim());
        double secondNo = Double.parseDouble(listOfNos.get(1).trim());
        listOfNos.remove(0);
        listOfNos.remove(0);

        String operator = listOfOperators.get(1).trim();
        listOfOperators.remove(0);

        String output = "";

        output = String.valueOf(new Operations().decideOperation(operator,firstNo,secondNo));

        listOfNos.add(0, output.replaceAll("\\.0$", ""));
        return evalExpressionWithMultipleOperators(listOfNos, listOfOperators);
    }

    public String evaluate(String expression){

        int beginIndex = expression.lastIndexOf('(');
        int endIndex = expression.indexOf(')', beginIndex);

        if(beginIndex < endIndex){
            String insideBrackets = expression.substring(beginIndex + 1, endIndex);
            String bracketOutput = evaluate(insideBrackets);
            return evaluate(expression.replace("(" + insideBrackets + ")", " " + bracketOutput + " "));
        }

        String[] listOfNos = expression.split("[+*/^-]");
        String[] listOfOperators = expression.split("[.0-9]+");

        return evalExpressionWithMultipleOperators(createList(listOfNos), createList(listOfOperators));
    }
}
