package lowLevelDesign.ticketBookingSystem.manager;

import lowLevelDesign.ticketBookingSystem.models.Movie;
import lowLevelDesign.ticketBookingSystem.models.Show;
import lowLevelDesign.ticketBookingSystem.models.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TheatreManager {

    List<Theatre> theatres;
    Map<String, List<Theatre>> cityToTheatreMap;

    public TheatreManager() {
        this.theatres = new ArrayList<>();
        this.cityToTheatreMap = new HashMap<>();
    }


    public  Map<Theatre, List<Show>> getAllTheatresAndShowsForMovies(Movie requestedMovie, String city) {
        List<Theatre> theatresForCity = cityToTheatreMap.get(city);
        Map<Theatre, List<Show>> theatreShowsMap = new HashMap<>();
        theatresForCity.forEach(theatre -> {
            List<Show> filteredShowsForMovie = theatre.getShowList().stream().filter(show -> show.getMovie().equals(requestedMovie)).collect(Collectors.toList());
            theatreShowsMap.put(theatre, filteredShowsForMovie);
        });
        return theatreShowsMap;
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(List<Theatre> theatres) {
        this.theatres = theatres;
    }

    public Map<String, List<Theatre>> getCityToTheatreMap() {
        return cityToTheatreMap;
    }

    public void setCityToTheatreMap(Map<String, List<Theatre>> cityToTheatreMap) {
        this.cityToTheatreMap = cityToTheatreMap;
    }
}
