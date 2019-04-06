package task5.figure.common;

import task5.figure.Figure;

public class IFigure extends Figure {

    private static final String[] image = {
            "" + C + C + C  + C,
            "" + C + "\n"+ C + "\n"+ C + "\n"+ C
    };

    public void render() {
        System.out.println("\n");
        System.out.println(image[position % 2]);
        System.out.println("\n");
    }
}
