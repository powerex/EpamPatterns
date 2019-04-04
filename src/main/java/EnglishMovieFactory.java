public class EnglishMovieFactory extends MovieFactory {

    private EnglishMovieFactory() {}

    @Override
    public Movie getNewMovie(String originalName, VideoQuality videoQuality) {
        Movie movie = new Movie(originalName, videoQuality);
        movie.setAudioLanguage(Language.EN);
        movie.setSubtitlesLanguage(Language.EN);
        return movie;
    }

    @Override
    public Movie changeLanguage(Movie movie) {
        movie.setAudioLanguage(Language.EN);
        movie.setSubtitlesLanguage(Language.EN);
        return movie;
    }

    public static class EnglishMovieFactoryHolder {
        private final static EnglishMovieFactory
                INSTANCE = new EnglishMovieFactory();
        public static EnglishMovieFactory getInstance() {
            return EnglishMovieFactoryHolder.INSTANCE;
        }
    }
}
