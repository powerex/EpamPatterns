package task3.model;

public abstract class MovieFactory {

    public static MovieFactory getMovieFactory(Language language) {
        if (language == null)
            return null;
        switch (language) {
            case UA: return UkrainianMovieFactory.UkrainianMovieFacrotyHolder.getInstance();
            case EN: return EnglishMovieFactory.EnglishMovieFactoryHolder.getInstance();
            default: return null;
        }
    }

    public abstract Movie getNewMovie(String originalName, VideoQuality videoQuality);
    public abstract Movie changeLanguage(Movie movie);
}
