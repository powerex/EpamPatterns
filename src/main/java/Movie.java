public class Movie {

    private String originalName;
    private VideoQuality videoQuality;
    private Language audioLanguage;
    private Language subtitlesLanguage;

    public Movie(String originalName, VideoQuality videoQuality) {
        this.originalName = originalName;
        this.videoQuality = videoQuality;
    }

    public void setAudioLanguage(Language audioLanguage) {
        this.audioLanguage = audioLanguage;
    }

    public void setSubtitlesLanguage(Language subtitlesLanguage) {
        this.subtitlesLanguage = subtitlesLanguage;
    }

    @Override
    public String toString() {
        return  "originalName\t'" + originalName + '\'' +
                "\n\tvideoQuality\t" + videoQuality +
                "\n\taudioLanguage\t\t" + audioLanguage +
                "\n\tsubtitlesLanguage\t" + subtitlesLanguage;
    }
}
