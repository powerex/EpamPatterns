package task6.model;

import task6.strategy.Condition;
import task6.strategy.MovingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Group implements MovingStrategy {

    private List<MovingStrategy> list;

    public Group() {
        list = new ArrayList<MovingStrategy>();
    }

    public Group(List<MovingStrategy> list) {
        this.list = list;
    }

    public void add(MovingStrategy character) {
        list.add(character);
    }

    public void move(Condition condition) {
        boolean magic = false;
        ListIterator<MovingStrategy> iterator = list.listIterator();
        while (!magic && iterator.hasNext())
            magic = iterator.next() instanceof Elf;

        if (magic) {
            System.out.println("All group is fly {");
            for (MovingStrategy character: list) {
                int index = character.getClass().toString().lastIndexOf(".");
                String className = character.getClass().toString();
                className = className.substring(index+1, className.length());
                System.out.println("\t" + className);
            }
            System.out.println("}");
        }
        else {
            for (MovingStrategy character: list)
                character.move(Condition.DEFAULT);
        }
    }
}
