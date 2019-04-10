package task2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expression implements SubExpression {

    private List<SubExpression> exprs;

    public Expression(SubExpression ... exprs) {
        this.exprs = new ArrayList<SubExpression>();
        this.exprs.addAll(Arrays.asList(exprs));
    }

    public Double value() {
        Double result = (double) 0;
        for (SubExpression expr: exprs) {
            result += expr.value();
        }
        return result;
    }

    public void add(SubExpression expr) {
        exprs.add(expr);
    }

    public void sub(SubExpression expr) {
        exprs.add(new NumberValue(-1*expr.value()));
    }

    public SubExpression getSubExpression(int index) {
        return exprs.get(index);
    }
}
