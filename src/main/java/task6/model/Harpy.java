package task6.model;

import task6.strategy.Condition;
import task6.strategy.MovingStrategy;

public class Harpy implements MovingStrategy {
    public void move(Condition condition) {
        System.out.println("Only sky is my element");
    }
}
