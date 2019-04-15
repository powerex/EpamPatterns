package task2.model2;

import java.util.ArrayList;
import java.util.List;

public class SimpleExpression implements Expression {

    String expression;
    List<Object> flow;

    public SimpleExpression(String expression) {
        this.expression = expression;
        flow = new ArrayList<>();
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return flow.toString();
    }
}
