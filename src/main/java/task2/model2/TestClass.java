package task2.model2;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {
<<<<<<< HEAD
//        String exp = "34";
        String exp = "2+34-(-34*74)+4+(6+(9*13))*1";
        Expression expr = Parser.convertStringToListExpression(exp);
        System.out.println(expr);
=======
        String exp = "2+34-(-34*74)+4+(6+(9*13))*1";
        List<Object> list = Parser.convertStringToListExpression(exp);
        System.out.println(list);

        String s = new String();
>>>>>>> df32025eca5fe0fe213226d5c2d2e6bca3464e37
    }

}
