## Expression Evaluator Release Note

### Release 0.4
    * This release supports expression with multiple operators.
    * Example :-
                "4.7 + 5.23 - 4 * 10"
                "6 - 7 / 20 * 30"
    * Known bug if spaces is given in between two numbers it considers it as one number.


### Release 0.3
    * This release supports expression with spaces in between.
    * Example :-
                "4.7 + 5.23"
                "6 - 7"
    * Known bug if spaces is given in between two numbers it considers it as one number.


### Release 0.2
    * This release supports expression with decimal operands.
    * Example :-
                "4.7+5.23"
                "6.6-3.87"


### Release 0.1
    * This release supports expression with two operands and one operator.
    * Only positive integer operands are allowed.
    * Operators allowed are +, -, *, /, ^.
    * Decimal operands are not allowed.
    * Spaces and brackets must not be there in expression.
    * Example :-
                "4+5"
                "6-3"