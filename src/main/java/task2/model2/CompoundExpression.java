package task2.model2;

import java.util.List;

public class CompoundExpression implements Expression {

    List<Object> list;

    public CompoundExpression(String expression) {
        list = Parser.convertStringToListExpression(expression);
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String getString() {
        return list.toString();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
