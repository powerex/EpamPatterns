package task2.model;

public interface SubExpression {
    Double value();

    void add(SubExpression expr);
    void sub(SubExpression expr);

    SubExpression getSubExpression(int index);
}
