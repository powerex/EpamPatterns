package task7.post;

import task7.model.Book;

public interface Publishing {
    void sendBook(Book book);
    void register(PostObserver post);
}
