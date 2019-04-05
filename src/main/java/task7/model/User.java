package task7.model;

import task7.post.PostObserver;

import java.util.List;

public class User implements PostObserver {

    private String name;
    private final BookGenre[] favouriteGenres;

    public User(String name, BookGenre[] favouriteGenres) {
        this.name = name;
        this.favouriteGenres = favouriteGenres;
    }

    public void update(Book book) {
        System.out.println(name + " go to by new book " + book.getName());
    }

    public BookGenre[] getFavouriteGenres() {
        return favouriteGenres;
    }

    public String getName() {
        return name;
    }
}
