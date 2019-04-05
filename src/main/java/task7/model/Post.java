package task7.model;

import task7.post.Agent;
import task7.post.PostObserver;

import java.util.*;

public class Post implements PostObserver, Agent {

    Map<BookGenre, List<PostObserver> > userLMapList = new HashMap<BookGenre, List<PostObserver>>();

    public void update(Book book) {
        System.out.println("\n==============================\nThe main post received new book");
        System.out.println(book);
        System.out.println();
        notify(book);
    }

    public void notify(Book book) {
        for (BookGenre g: book.getGenres()) {
            List<PostObserver> list = (userLMapList.get(g));
            if (list != null) // when nobody subscribe such genre
            for (PostObserver user: list) {
                if (user != null)
                user.update(book);
            }
        }
    }

    public void register(PostObserver user) {
        for (BookGenre genre: ((User)user).getFavouriteGenres()) {
            List<PostObserver> list = userLMapList.get(genre);
            if (list != null) {
                list.add(user);
            }
            else {
                list = new LinkedList<PostObserver>();
                list.add(user);
                userLMapList.put(genre, list);
            }
        }
    }

    public void viewAllUsersInfo() {
        Set<BookGenre> genresSet = userLMapList.keySet();
        for (BookGenre g: genresSet) {
            System.out.println(g + ": ");
            for (PostObserver user: (userLMapList.get(g))) {
                System.out.println("\t\t" +((User)user).getName());
            }
            System.out.println();
        }
    }
}
