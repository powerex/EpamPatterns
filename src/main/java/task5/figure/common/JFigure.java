package task5.figure.common;

import task5.figure.Figure;

public class JFigure extends Figure {

    private static final String[] image = {
            " " + C + "\n " + C + "\n" + C + C,
            "" + C + "\n" + C + C + C,
            "" + C + C + "\n" + C + "\n" + C,
            "" + C + C + C + "\n  " + C
    };

    public void render() {
        System.out.println("\n");
        System.out.println(image[position]);
        System.out.println("\n");
    }
}
