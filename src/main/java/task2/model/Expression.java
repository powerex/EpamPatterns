package task2.model;

import java.util.ArrayList;
import java.util.List;

public class Expression implements SubExpression {

    private List<SubExpression> exprs;

    public Expression(SubExpression ... exprs) {
        this.exprs = new ArrayList<SubExpression>();
        for (SubExpression expr: exprs) {
            this.exprs.add(expr);
        }
    }

    public Double value() {
        Double result = new Double(0);
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
