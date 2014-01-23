package mohitsha.evaluator;

import mohitsha.evaluator.lib.EvaluatorLib;

public class Evaluator {
    public static void main(String[] args) {
        String output = new EvaluatorLib().evaluate(args[0]);
        System.out.println(output);
    }
}
