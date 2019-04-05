package task3.model;

public class UkrainianMovieFactory extends MovieFactory {

    private UkrainianMovieFactory() {}

    public Movie getNewMovie(String originalName, VideoQuality videoQuality) {
        Movie movie = new Movie(originalName, videoQuality);
        movie.setAudioLanguage(Language.UA);
        movie.setSubtitlesLanguage(Language.UA);
        return movie;
    }

    public Movie changeLanguage(Movie movie) {
        movie.setAudioLanguage(Language.UA);
        movie.setSubtitlesLanguage(Language.UA);
        return movie;
    }

    public static class UkrainianMovieFacrotyHolder {
        private final static UkrainianMovieFactory
            INSTANCE = new UkrainianMovieFactory();
        public static UkrainianMovieFactory getInstance() {
            return UkrainianMovieFacrotyHolder.INSTANCE;
        }
    }

}
