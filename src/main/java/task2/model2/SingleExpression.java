package task2.model2;

public class SingleExpression implements Expression {

    String number;

    public SingleExpression(String number) {
        this.number = number;
    }

    @Override
    public double getValue() {
        return Double.valueOf(number);
    }

    @Override
    public String toString() {
        return number;
    }
}
