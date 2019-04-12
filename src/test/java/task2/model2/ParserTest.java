package task2.model2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parserTestWhenSingleExpression() {
        String string = "34";
        Expression expression = Parser.convertStringToListExpression(string);
        assertEquals("Must be single expression", "34", expression.toString());
    }

    @Test
    public void parserTestWhenCompoundExpression() {
        String string = "2+34-(-34*74)+4+(6+(9*13))*1";
        Expression expression = Parser.convertStringToListExpression(string);
        assertEquals("Must be full compound expression",
                "[2, ADD, 34, SUB, [SUB, 34, MULT, 74], ADD, 4, ADD, [6, ADD, [9, MULT, 13]], MULT, 1]",
                expression.toString());
    }

}