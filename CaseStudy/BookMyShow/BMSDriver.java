package BookMyShow;
import BookMyShow.movie.Movie;
import BookMyShow.search.Catalog;

import java.util.Date;
import java.util.List;



public class BMSDriver {
    public static void main(String[] args) {

        // Create a user

        // Create a few movies
        createMovies();

        // Create shows for the movies

        // Create cinema halls

        // Create seat list

        // Search for movies

        Catalog catalog = Catalog.getInstance();
        List<Movie> movies = catalog.searchByCity("Delhi");

        for( Movie movie : movies) {
            System.out.println("Movie found: " + movie.getTitle() + " in " + movie.getCity());
        }
        // create a booking with show, list of seats and person
    }

    private static void createMovies() {
        // Implementation to create movies
        // Example: Movie movie1 = new Movie("Inception", "Sci-Fi", "Christopher Nolan");
        // catalog.addMovie(movie1);
        Catalog catalog = Catalog.getInstance();
        Movie movie = new Movie();
        movie.setId(1);
        movie.setTitle("Inception");
        movie.setLanguage("English");
        movie.setGenre("Sci-Fi");
        // Use Calendar to avoid deprecated Date constructor
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2010, java.util.Calendar.JULY, 16, 0, 0, 0);
        cal.set(java.util.Calendar.MILLISECOND, 0);
        movie.setReleaseDate(cal.getTime()); // Year is 2010, month is JULY (0-based)
        movie.setCity("Delhi");
        catalog.addMovie(movie);

    }
}
