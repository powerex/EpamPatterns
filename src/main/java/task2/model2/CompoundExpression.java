package task2.model2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CompoundExpression implements Expression {

    List<Object> list;

    public CompoundExpression(List<Object> list) {
        this.list = list;
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public Expression toPolishNotation() {
        List<Object> flow = new LinkedList<>();
        Stack<Operation> operations = new Stack<>();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object e = iterator.next();
            if (e instanceof Operation) {

            }
            else if (e instanceof Expression) {
                flow.add(((Expression) e).toPolishNotation());
            }
            else {
                //
            }
        }
        return new CompoundExpression(flow);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
