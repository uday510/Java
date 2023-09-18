import java.util.Scanner;

public class NextMain {

    public static void main(String[] args) {

       Movie movie = Movie.getMovie("A", "Jaws");
       movie.watchMovie();

       Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
       jaws.watchMovie();
    }
}
