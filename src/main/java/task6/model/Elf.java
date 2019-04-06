package task6.model;

import task6.strategy.Condition;
import task6.strategy.MovingStrategy;

public class Elf implements MovingStrategy {
    public void move(Condition condition) {
        switch (condition) {
            case FLY:
                System.out.println("Elfs can fly");
                break;
            default:
                System.out.println("Elf run");

        }
    }
}
