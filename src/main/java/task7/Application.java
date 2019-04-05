package task7;

import task7.model.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import static task7.model.BookGenre.*;

public class Application {
    public static void main(String[] args) {
        Post mainPost = new Post();

        PublishingHouse oldLeo = new PublishingHouse();
        oldLeo.register(mainPost);
        PublishingHouse williams = new PublishingHouse();
        williams.register(mainPost);
        PublishingHouse apress = new PublishingHouse();
        apress.register(mainPost);

        User user1 = new User("Stan", new BookGenre[]{HISTORYC});
        User user2 = new User("Mark", new BookGenre[]{SCIENCE});
        User user3 = new User("AZbest", new BookGenre[]{PROGRAMMING});
        User user4 = new User("Bob", new BookGenre[]{SCIENCE, NOVEL});

        mainPost.register(user1);
        mainPost.register(user2);
        mainPost.register(user3);
        mainPost.register(user4);

        //oldLeo.sendBook(new Book("WorldMap", new LinkedList<BookGenre>(Collections.singleton(SCIENCE))));
        apress.sendBook(new Book("Spring 5", Arrays.asList(PROGRAMMING, FANTASTIC)));

//        mainPost.viewAllUsersInfo();

    }
}
