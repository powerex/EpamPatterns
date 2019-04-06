package task6;

import task6.model.*;
import task6.strategy.Condition;
import task6.strategy.MovingStrategy;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        System.out.println("All about ELF");
        Elf elf = new Elf();
        elf.move(Condition.DEFAULT);
        elf.move(Condition.FLY);
        elf.move(Condition.RUN);
        elf.move(Condition.SWIMM);

        System.out.println("\n\nAll about HARPY");
        Harpy harpy = new Harpy();
        harpy.move(Condition.DEFAULT);
        harpy.move(Condition.FLY);
        harpy.move(Condition.RUN);
        harpy.move(Condition.SWIMM);

        System.out.println("\n\nAll about ORC");
        Orc orc = new Orc();
        orc.move(Condition.DEFAULT);
        orc.move(Condition.FLY);
        orc.move(Condition.RUN);
        orc.move(Condition.SWIMM);

        System.out.println("\n\nAll about PEGASUS");
        Pegasus pegasus = new Pegasus();
        pegasus.move(Condition.DEFAULT);
        pegasus.move(Condition.FLY);
        pegasus.move(Condition.RUN);
        pegasus.move(Condition.SWIMM);

        System.out.println("\n\nAll about TROLL");
        Troll troll = new Troll();
        troll.move(Condition.DEFAULT);
        troll.move(Condition.FLY);
        troll.move(Condition.RUN);
        troll.move(Condition.SWIMM);

        System.out.println("\n\nAll about VAMPIRE");
        Vampire vampire = new Vampire();
        vampire.move(Condition.DEFAULT);
        vampire.move(Condition.FLY);
        vampire.move(Condition.RUN);
        vampire.move(Condition.SWIMM);

        System.out.println("\n\nGroup with magic");
        Group group1 = new Group();
        group1.add(elf);
        group1.add(troll);
        group1.add(pegasus);
        group1.move(Condition.DEFAULT);

        System.out.println("\n\nGroup without magic");
        Group group2 = new Group();
        group2.add(vampire);
        group2.add(troll);
        group2.add(orc);
        group2.move(Condition.DEFAULT);

    }

}
