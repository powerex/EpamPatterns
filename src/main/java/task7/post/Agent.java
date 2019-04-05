package task7.post;

import task7.model.Book;

public interface Agent {
    void notify(Book book);
    void register(PostObserver user);
}
