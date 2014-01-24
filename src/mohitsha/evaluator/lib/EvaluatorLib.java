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

    private double getCorrectNumber(List<String> listOfNos, List<String> listOfOperators) {
        double number;
        if(listOfNos.get(0).trim().equals("")){
            listOfNos.remove(0);
            number = Double.parseDouble(listOfOperators.get(0).trim() + listOfNos.get(0).trim());
            listOfOperators.remove(0);
        }
        else number =  Double.parseDouble(listOfNos.get(0).trim());
        listOfNos.remove(0);
        return number;
    }

    private String evalExpressionWithMultipleOperators(List<String> listOfNos, List<String> listOfOperators){

        double firstNo = getCorrectNumber(listOfNos, listOfOperators);

        if(listOfOperators.size() == 0) return String.valueOf(firstNo).replaceAll("\\.0$", "");

        double secondNo = getCorrectNumber(listOfNos,listOfOperators);

        String operator = listOfOperators.get(0).trim();
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

        String[] collectionOfNumbers = expression.split("[+*/^-]");
        String[] collectionOfOperators = expression.replaceAll("[.0-9\\s]+","").split("");

        List<String> listOfNos = createList(collectionOfNumbers);
        List<String> listOfOperators = createList(collectionOfOperators);

        listOfOperators.remove(0);

        return evalExpressionWithMultipleOperators(listOfNos,listOfOperators);
    }
}
