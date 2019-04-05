package task7.model;

import java.util.List;

public class Book {
    private String name;
    private List<BookGenre> genres;

    public Book(String name, List<BookGenre> genres) {
        this.genres = genres;
        this.name = name;
    }

    public List<BookGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<BookGenre> genres) {
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genres=" + genres +
                '}';
    }
}
