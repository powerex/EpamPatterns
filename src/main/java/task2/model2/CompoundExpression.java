package task2.model2;

import java.util.List;
import java.util.Stack;

public class CompoundExpression implements Expression {

    List<Object> list;
    Stack<Operation> operations = new Stack();

    public CompoundExpression(List<Object> list) {
        this.list = list;
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
