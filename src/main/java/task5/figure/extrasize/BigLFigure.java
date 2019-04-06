package task5.figure.extrasize;

import task5.figure.Figure;

public class BigLFigure extends Figure {
    private static final String[] image = {
            "" + C + C + "\n" + C + C + "\n" + C + C + "\n" + C + C + "\n" + C + C +  C + C + "\n" + C + C + C + C,
            "" + C + C + C + C + C + C + "\n" + C + C + C + C + C + C + "\n" + C + C + "\n" + C + C,
            "" + C + C + C + C + "\n" + C + C + C + C + "\n  " + C + C + "\n  " + C + C + "\n  " + C + C + "\n  " + C + C,
            "    " + C + C + "\n    " + C + C + "\n" + C + C + C + C + C + C + "\n" + C + C + C + C + C + C
    };

    public void render() {
        System.out.println("\n");
        System.out.println(image[position]);
        System.out.println("\n");
    }
}
