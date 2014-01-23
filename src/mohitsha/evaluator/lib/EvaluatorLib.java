package mohitsha.evaluator.lib;

public class EvaluatorLib {

    public String evaluate(String expression){

        Operations op = new Operations();

        String[] listOfNos = expression.split("[+*/^-]");
        String[] listOfOperators = expression.split("[.0-9]+");

        double firstNo = Double.parseDouble(listOfNos[0]);
        double secondNo = Double.parseDouble(listOfNos[1]);

        String operator = listOfOperators[1];

        String output = "";

        if(operator.equals("+"))
            output = String.valueOf(op.addTwoNumbers(firstNo, secondNo));
        if(operator.equals("-"))
            output = String.valueOf(op.subtractTwoNumbers(firstNo, secondNo));
        if(operator.equals("*"))
            output = String.valueOf(op.multiplyTwoNumbers(firstNo, secondNo));
        if(operator.equals("/"))
            output = String.valueOf(op.getQuotient(firstNo, secondNo));
        if(operator.equals("^"))
            output = String.valueOf(op.getExponential(firstNo, secondNo));

        return output.replaceAll("\\.0$","");
    }
}
