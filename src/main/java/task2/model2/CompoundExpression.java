package task2.model2;

import java.util.List;

public class CompoundExpression implements Expression {

    List<Object> list;

<<<<<<< HEAD
    public CompoundExpression(List<Object> list) {
        this.list = list;
=======
    public CompoundExpression(String expression) {
        list = Parser.convertStringToListExpression(expression);
>>>>>>> df32025eca5fe0fe213226d5c2d2e6bca3464e37
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
