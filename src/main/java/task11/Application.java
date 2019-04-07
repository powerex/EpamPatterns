package task11;

import java.util.Random;

public class Application {

    static Random r = new Random();

    private static String[] types = {"Actinobacteria", "Aquificae", "Chlorobi", "Proteobacteria", "Thermotogae"};
    private static String[] colors = {"red", "green", "blue"};

    public static String getRandType() {
        return types[r.nextInt(types.length)];
    }

    public static String getRandColor() {
        return colors[r.nextInt(colors.length)];
    }

    public static void main(String[] args) throws InterruptedException {
        Tube tube = new Tube();
        for (int i=0; i<20; i++) {
            Bacterium v = tube.getBacterium(
                    getRandType(),
                    getRandColor(),
                    r.nextInt(5)+1
            );
            if (v != null) {
                System.out.println("bacterium" + (i+1));
                v.addToTube();
            }
            else {
                i--;
                Thread.sleep(1000);
            }
        }
    }
}
