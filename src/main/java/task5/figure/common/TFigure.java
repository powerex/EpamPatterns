package task5.figure.common;

import task5.figure.Figure;

public class TFigure extends Figure {
    private static final String[] image = {
            "" + C + C + C + "\n " + C,
            " " + C + "\n" + C + C + "\n " + C,
            " " + C + "\n" + C + C + C,
            "" + C + "\n" + C + C + "\n" + C
    };

    public void render() {
        System.out.println("\n");
        System.out.println(image[position]);
        System.out.println("\n");
    }
}
