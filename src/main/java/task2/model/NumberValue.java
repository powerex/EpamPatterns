package task2.model;

public class NumberValue implements SubExpression {

    private Double value;

    public NumberValue(Double value) {
        this.value = value;
    }

    public void add(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    public SubExpression getSubExpression(int index) {
        throw new UnsupportedOperationException();
    }

    public void sub(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    public void mult(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    public void div(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    public Double value() {
        return value;
    }

}
