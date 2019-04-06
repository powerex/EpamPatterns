package task5;

import task5.Factory.FigureFactory;
import task5.figure.Figure;

public class Application {

    private static final char[] figures = {'i', 'j', 'l', 'o', 's', 't', 'z'};

    public static void main(String[] args) {
        FigureFactory figureFactory = new FigureFactory();
        Figure figure;
        char f = figures[((int)(Math.random()*10)) % figures.length];
        if (Math.random() > .5) f = Character.toUpperCase(f);
//        figure = figureFactory.getFigure('Z');
        figure = figureFactory.getFigure(f);
        figure.render();
        figure.rotateRight();
        figure.rotateRight();
        figure.rotateRight();
        figure.rotateLeft();
        figure.rotateLeft();
        figure.rotateLeft();

    }

}
