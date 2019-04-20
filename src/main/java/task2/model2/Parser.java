package task2.model2;

import task2.model.Expr;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Parser {

    private static final ArrayList<Character> numbers = new ArrayList<>(Arrays.asList('1','2','3','4','5','6','7','8','9','0','.'));

    public static Expression convertStringToListExpression(String expression) {
        List<Object> flow = new ArrayList<>();

        if (!expression.matches(".*[(?!.\\*\\+\\-)].*")) {
            return new SingleExpression(expression);
        }
        else// if (!expression.matches(".*[()]*."))
        {
            int i = 0;
            while (i < expression.length()) {
                int j = i;
                while (j < expression.length() && numbers.contains(expression.charAt(j)))
                    j++;
                if (j>i) {
                    flow.add(new SingleExpression(expression.substring(i, j)));
                }
                i = j;
                if (i == expression.length()) break;
                switch (expression.charAt(i)) {
                    case '+':
                        flow.add(Operation.ADD);
                        i++;
                        break;
                    case '-':
                        flow.add(Operation.SUB);
                        i++;
                        break;
                    case '/':
                        flow.add(Operation.DIV);
                        i++;
                        break;
                    case '*':
                        flow.add(Operation.MULT);
                        i++;
                        break;
                    case '(':
                        int levelBaraces = 1;
                        j = i;
                        while (expression.charAt(j) != ')' || levelBaraces != 0) {
                            j++;
                            if (expression.charAt(j) == '(')
                                levelBaraces++;
                            if (expression.charAt(j) == ')')
                                levelBaraces--;
                        }
                        flow.add(Parser.convertStringToListExpression(expression.substring(i+1, j)));
                        i = j+1;
                        break;
                    default:
                        break;
                }
            }

            return new CompoundExpression(flow);
        }
    }

}