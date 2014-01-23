package mohitsha.evaluator.lib;


import java.util.HashMap;
import java.util.Map;

interface Calculate{
    double performOperation(double firstNo,double secondNo);
}

public class Operations {

    public double decideOperation(String operator,double firstNo, double secondNo){
        Map<String,Calculate> operation = new HashMap<String, Calculate>();
        operation.put( "+" , new Calculate() {
            @Override
            public double performOperation(double firstNo, double secondNo) {
                return firstNo + secondNo;
            }
        });
        operation.put( "-" , new Calculate() {
            @Override
            public double performOperation(double firstNo, double secondNo) {
                return firstNo - secondNo;
            }
        });
        operation.put( "*" , new Calculate() {
            @Override
            public double performOperation(double firstNo, double secondNo) {
                return firstNo * secondNo;
            }
        });
        operation.put( "/" , new Calculate() {
            @Override
            public double performOperation(double firstNo, double secondNo) {
                return firstNo / secondNo;
            }
        });
        operation.put( "^" , new Calculate() {
            @Override
            public double performOperation(double firstNo, double secondNo) {
                return Math.pow(firstNo, secondNo);
            }
        });

        return operation.get(operator).performOperation(firstNo,secondNo);
    }
}
