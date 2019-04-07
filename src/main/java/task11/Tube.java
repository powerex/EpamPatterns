package task11;

import java.util.LinkedList;
import java.util.List;

public class Tube {

    private final int MAX = 5;

    private List<Bacterium> pool = new LinkedList<>();

    public Tube() {
        for (int i=0; i<MAX; i++) {
            pool.add(new Bacterium("v"+(i+1)));
        }
    }

    public Bacterium getBacterium(String type, String color, int duration) {
        for (Bacterium b: pool) {
            if (!b.isActive()) {
                b.setProperties(type, color, duration);
                return b;
            }
        }
        return null;
    }
}
