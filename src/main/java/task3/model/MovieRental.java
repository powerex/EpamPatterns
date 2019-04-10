package task3.model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class MovieRental {

    private List<String> moviesNames;
    private String fileName;
    private MovieFactory movieFactory;


    public MovieRental(String fileName) {
        this.fileName = fileName;
        moviesNames = new LinkedList<String>();
        try
        {
            moviesNames =
                    Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public Movie getMovie(String originalName, VideoQuality videoQuality, Language language) {
        return movieFactory.getMovieFactory(language).getNewMovie(originalName, videoQuality);
    }

    public Movie changeMovieLanguage(Movie movie, Language language) {
        return movieFactory.getMovieFactory(language).changeLanguage(movie);
    }
}
