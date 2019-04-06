package task6.model;

import task6.strategy.Condition;
import task6.strategy.MovingStrategy;

public class Pegasus implements MovingStrategy {
    public void move(Condition condition) {
        switch (condition) {
            case FLY:
                System.out.println("If you have wings it's so cool");
                break;
            case SWIMM:
                System.out.println("Wet wings... whatever");
                break;
            default:
                System.out.println("gallop");

        }
    }
}
