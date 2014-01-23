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

    private String evalWholeExpression(List<String> listOfNos,List<String> listOfOperators){

        if(listOfNos.size() < 2) return listOfNos.get(0);

        double firstNo = Double.parseDouble(listOfNos.get(0));
        double secondNo = Double.parseDouble(listOfNos.get(1));
        listOfNos.remove(0);
        listOfNos.remove(0);

        String operator = listOfOperators.get(1);
        listOfOperators.remove(0);

        String output = "";

        output = String.valueOf(new Operations().decideOperation(operator,firstNo,secondNo));

        listOfNos.add(0, output.replaceAll("\\.0$", ""));
        return evalWholeExpression(listOfNos, listOfOperators);
    }

    private String evalBracketExpression(String expression) {
        int beginIndex = expression.indexOf('(') + 1;
        int endIndex = expression.lastIndexOf(')');

        String insideBrackets = expression.substring(beginIndex, endIndex);
        String bracketOutput = evaluate(insideBrackets);

        return expression.replace("(" + insideBrackets + ")", bracketOutput);
    }

    public String evaluate(String expression){

        expression = expression.replaceAll("\\s","");

        if(expression.indexOf('(') < expression.lastIndexOf(')'))
            expression = evalBracketExpression(expression);

        String[] listOfNos = expression.split("[+*/^-]");
        String[] listOfOperators = expression.split("[.0-9]+");

        return evalWholeExpression(createList(listOfNos),createList(listOfOperators));
    }

}