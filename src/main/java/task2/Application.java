package task2;

import task2.model2.Expression;
import task2.model2.Parser;

public class Application {

    public static void main(String[] args) {

        String input = "20-(5-2)-(11+6)";

        Expression expr = Parser.convertStringToListExpression(input);
        System.out.println(expr);

//        SubExpression a = new Expression(new NumberValue(5.), new NumberValue(-2.));
//        SubExpression b = new Expression(new NumberValue(11.), new NumberValue(6.));

//        System.out.println(a.value());
//        System.out.println(b.value());
//
//        expr.add(new NumberValue(20.));
//        expr.sub(a);
//        expr.sub(b);
//
//        System.out.println(expr.value());
    }

}
