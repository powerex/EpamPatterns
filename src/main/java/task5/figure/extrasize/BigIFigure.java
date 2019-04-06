package task5.figure.extrasize;

import task5.figure.Figure;

public class BigIFigure extends Figure {
    private static final String[] image = {
            "" + C + C + C + C+ C + C + C + C + "\n" + C + C + C + C + C + C + C + C,
            "" + C + C + "\n"+ C + C + "\n"+ C + C + "\n"+ C + C + "\n"+ C + C + "\n"+ C + C + "\n"+ C + C
    };

    public void render() {
        System.out.println("\n");
        System.out.println(image[position % 2]);
        System.out.println("\n");
    }
}
