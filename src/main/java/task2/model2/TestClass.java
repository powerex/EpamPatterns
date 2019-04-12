package task2.model2;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {
//        String exp = "34";
        String exp = "2+34-(-34*74)+4+(6+(9*13))*1";
        Expression expr = Parser.convertStringToListExpression(exp);
        System.out.println(expr);
    }

}
