package task6.model;

import task6.strategy.Condition;
import task6.strategy.MovingStrategy;

public class Vampire implements MovingStrategy {
    public void move(Condition condition) {
        switch (condition) {
            case FLY:
                System.out.println("Transform into bat...");
                break;
            case SWIMM:
                System.out.println("Transform into dolphin");
                break;
            default:
                System.out.println("Tiptoe");

        }
    }
}
