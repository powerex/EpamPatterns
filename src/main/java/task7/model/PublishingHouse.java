package task7.model;

import task7.post.PostObserver;
import task7.post.Publishing;

import java.util.LinkedList;
import java.util.List;

public class PublishingHouse implements Publishing {

    private List<PostObserver> posts = new LinkedList<PostObserver>();

    public void sendBook(Book book) {
        for (PostObserver post: posts)
            post.update(book);
    }

    public void register(PostObserver post) {
        posts.add(post);
    }
}
