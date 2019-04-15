package task2.model2;

public enum Operation {

    ADD(2), SUB(3), MULT(4), DIV(4);

    public int priority;

    Operation(int priority) {
        this.priority = priority;
    }
}
