import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //TODo code appliction

        Movies movies1 = new Movies(31, "Scary Movie", "Keenen Ivory Wayans", "Horror", 2000, 8.2);
        Movies movies2 = new Movies(52, "Scary Movie 2", "Keenen Ivory Wayans", "Horror", 2001, 8.9);
        Movies movies3 = new Movies(333, "Scary Movie 3", "David Zucker", "Horror", 2003, 8.6);
        Movies movies4 = new Movies(534, "Scary Movie 4", "David Zucker", "Horror", 2006, 8.1);
        Movies movies5 = new Movies(725, "Scary Movie 5", "Malcolm D. Lee", "Horror", 2013, 8.7);
        Movies movies6 = new Movies(12, "Die Hard", "John McTiernan", "Action", 1988, 10.0);
        Movies movies7 = new Movies(21, "Die Hard 2 Die Harder", "Renny Harlin", "Action", 1990, 9.5);
        Movies movies8 = new Movies(28, "Die Hard Mega Hard", "John McTiernan", "Action", 1995, 9.8);

        ArrayList<Movies> movies = new ArrayList<>();

        movies.add(movies1);
        movies.add(movies2);
        movies.add(movies3);
        movies.add(movies4);
        movies.add(movies5);
        movies.add(movies6);
        movies.add(movies7);
        movies.add(movies8);


        System.out.println("Before sort....");

        Collections.shuffle(movies);

        for (Movies c : movies) {
            System.out.println(c);


        }

        //java - Lambda Expression
        Comparator<Movies> byDirector = (Movies movie1, Movies movie2) -> movie1.getDirector().compareTo(movie2.getDirector());
        Comparator<Movies> byGenre = (Movies movie1, Movies movie2) -> movie1.getGenre().compareTo(movie2.getGenre());
        Comparator<Movies> byTitle = (Movies movie1, Movies movie2) ->      movie1.getTitle().compareTo(movie2.getTitle());
        Comparator<Movies> byid = (Movies movie1, Movies movie2) -> {
            return movie1.getId() - movie2.getId();
        };


        Comparator<Movies> byRating = (Movies movie1, Movies movie2) -> {
            if (movie1.getRating() < movie2.getRating())
                return 1;
            else if (movie1.getRating() > movie2.getRating())
                return -1;
            else return 0;
        };


        Collections.sort(movies, byid);


        System.out.println("After sort....");

        for (Movies c : movies)
            System.out.println(c);


    }
}
