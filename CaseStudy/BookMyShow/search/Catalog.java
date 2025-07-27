package BookMyShow.search;
import BookMyShow.movie.Movie;
import BookMyShow.movie.CinemaHall;
import BookMyShow.movie.Show;
import BookMyShow.movie.ShowSeat;
import BookMyShow.movie.Cinema;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Catalog implements Search {
    HashMap<String, List<Movie>> movieTitles;
    HashMap<String, List<Movie>> movieLanguages;
    HashMap<String, List<Movie>> movieGenres;
    HashMap<Date, List<Movie>> movieReleaseDates;
    HashMap<String, List<Movie>> movieCities;

    private Catalog() {
        movieTitles = new HashMap<>();
        movieLanguages = new HashMap<>();
        movieGenres = new HashMap<>();
        movieReleaseDates = new HashMap<>();
        movieCities = new HashMap<>();
    }

    public static Catalog instance = null;

    // Singleton pattern to ensure only one instance of Catalog exists
    public static Catalog getInstance() {
        if (instance == null) {
            instance = new Catalog();
        }
        return instance;
    }

    public void addMovie(Movie movie) {
        List<Movie> movies = movieTitles.getOrDefault(movie.getTitle(), new ArrayList<>());
        movies.add(movie);
        movieTitles.put(movie.getTitle(), movies);

        movies = movieLanguages.getOrDefault(movie.getLanguage(), new ArrayList<>());
        movies.add(movie);
        movieLanguages.put(movie.getLanguage(), movies);

        movies = movieCities.getOrDefault(movie.getCity(), new ArrayList<>());
        movies.add(movie);
        movieCities.put(movie.getCity(), movies);

        movies = movieGenres.getOrDefault(movie.getGenre(), new ArrayList<>());
        movies.add(movie);
        movieGenres.put(movie.getGenre(), movies);

        movies = movieReleaseDates.getOrDefault(movie.getReleaseDate(), new ArrayList<>());
        movies.add(movie);
        movieReleaseDates.put(movie.getReleaseDate(), movies);

    }

    @Override
    public List<Movie> searchByTitle(String title) {
        return movieTitles.getOrDefault(title, null);
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        // Implementation for searching movies by language
        return movieLanguages.getOrDefault(language, null);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        // Implementation for searching movies by genre
        return movieGenres.getOrDefault(genre, null);
    }

    @Override
    public List<Movie> searchByReleaseDate(String releaseDate) {
        // Implementation for searching movies by release date
        return movieReleaseDates.getOrDefault(releaseDate, null);
    }

    @Override
    public List<Movie> searchByCity(String cityName) {
        // Implementation for searching movies by city
        return movieCities.getOrDefault(cityName, null);
    }

}
