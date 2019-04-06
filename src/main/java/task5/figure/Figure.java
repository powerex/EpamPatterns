package task5.figure;

public abstract class Figure {

    protected int position = 0;
    final static protected char C = (char)3;

    abstract public void render();

    public void rotateLeft() {
        position = (position + 3) % 4;
        render();
    }

    public void rotateRight() {
        position = (position + 1) % 4;
        render();
    }

}
