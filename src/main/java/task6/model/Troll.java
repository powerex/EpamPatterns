package task6.model;

import task6.strategy.Condition;
import task6.strategy.MovingStrategy;

public class Troll implements MovingStrategy {
    public void move(Condition condition) {
        System.out.println("I'm arc and I run");
    }
}
