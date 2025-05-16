package compare.comparable;

import compare.comparator.NameCompare;

import java.util.ArrayList;
import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        Movie terminator = new Movie("Terminator", "thriller", 2000, 9.0);
        Movie silenceOfTheLamb = new Movie("Silance Of the Lamb", "Horror", 1990, 9.8);
        Movie upsideDown = new Movie("Upside Down", "comedy", 2020, 10);

        Movie[] movies = {terminator, silenceOfTheLamb, upsideDown};
        Arrays.sort(movies);

        for (Movie movie: movies) {
            System.out.println(movie.getName() + " " + movie.getYear() );
        }

        System.out.println("Sorted by name: ");

        NameCompare nameCompare = new NameCompare();
        Arrays.sort(movies, nameCompare);

        for (Movie movie: movies) {
            System.out.println(movie.getName() + " " + movie.getYear() );
        }


    }
}
