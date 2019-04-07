package task11;

import java.util.Timer;
import java.util.TimerTask;

public class Bacterium {

    private String name;
    private String type;
    private String color;
    private boolean active;
    private int lifeDuration;

    public Bacterium(String name) {
        this.name = name;
    }

    public void setProperties(String type, String color, int duration) {
        this.type = type;
        this.color = color;
        this.lifeDuration = duration;
    }

    public boolean isActive() {
        return active;
    }

    public void addToTube() {
        System.out.println("->" + name + "-" + type + "-" + color + "-" + lifeDuration + " seconds");

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                active = false;
                System.out.println(name+"->OUT");
            }
        }, lifeDuration *1000);
        active = true;
    }
}
