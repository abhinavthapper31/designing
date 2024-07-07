package lowLevelDesign.ticketBookingSystem.manager;

import lowLevelDesign.ticketBookingSystem.models.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieManager {

    List<Movie> movies;
    Map<String, List<Movie>> cityToMoviesMap;

    public MovieManager() {
        this.movies = new ArrayList<>();
        this.cityToMoviesMap = new HashMap<>();
    }

    void addMovie(Movie movie, String city) {
        movies.add(movie);

        if (cityToMoviesMap.get(city) != null) {
            List<Movie> movies = cityToMoviesMap.get(city);
            movies.add(movie);
            cityToMoviesMap.put(city, movies);
        } else {
            List<Movie> movies = new ArrayList<>();
            movies.add(movie);
            cityToMoviesMap.put(city, movies);
        }
    }

    public Movie findTheRequestedMovieByNameAndCity(String movieName, String city) {
        List<Movie> moviesInCity = cityToMoviesMap.get(city);
        Movie requstedMovie = moviesInCity.stream().filter(movie -> movie.getName().equalsIgnoreCase(movieName)).findFirst().orElse(null);
        return requstedMovie;
    }
}
