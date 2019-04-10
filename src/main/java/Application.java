import task3.model.Language;
import task3.model.Movie;
import task3.model.MovieRental;
import task3.model.VideoQuality;

public class Application {

    public static void main(String[] args) {

        MovieRental movieRental= new MovieRental("database.txt");
        Movie movie1 = movieRental.getMovie("7 Pounds", VideoQuality.HD_720, Language.UA);
        System.out.println(movie1);
        Movie movie2 = movieRental.getMovie("7 Pounds", VideoQuality.OctaHD_4320, Language.EN);
        System.out.println(movie2);

    }

}
