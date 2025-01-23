package lowLevelDesign.ticketBookingSystem;

import lowLevelDesign.ticketBookingSystem.manager.MovieManager;
import lowLevelDesign.ticketBookingSystem.manager.TheatreManager;
import lowLevelDesign.ticketBookingSystem.models.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BookMyShowSystem {

    private MovieManager movieManager;
    private TheatreManager theatreManager;

    BookMyShowSystem(MovieManager movieManager, TheatreManager theatreManager) {
        this.movieManager = movieManager;
        this.theatreManager = theatreManager;
    }

    public BookMyShowSystem() {

    }




    public Map<Theatre, List<Show>> findTheatresByNameAndLocation(String movieName, String city) {
        Movie requestedMovie = movieManager.findTheRequestedMovieByNameAndCity(movieName, city);

        if (requestedMovie == null) {
            System.out.println("This movie is not available in your city ! ");
            return Collections.emptyMap();
        }

        Map<Theatre, List<Show>> theatreShowMap = theatreManager.getAllTheatresAndShowsForMovies(requestedMovie, city);
        return theatreShowMap;
    }

    public Booking createBooking(String theatreName, Integer showId, Integer seatId, User user) {
        // get the show using the showId
        Theatre selectedTheatre = theatreManager.getTheatres().stream().filter(theatre -> theatre.getName().equalsIgnoreCase(theatreName)).findFirst().orElse(null);

        // add seated Id to bookedSeatIds
        Show show = selectedTheatre.getShowList().stream().filter(show1 -> show1.getShowId().equals(showId)).findFirst().orElse(null);

        Seat selectedSeat = show.getScreen().getSeats().stream().filter(seat -> seat.getSeatId().equals(seatId)).findFirst().orElse(null);
        selectedSeat.setBooked(true);
        show.getBookedSeatIds().add(selectedSeat.getSeatId());
        // generate a Booking

        return new Booking(1, user.getName(), show.getMovie().getName(), selectedSeat.getSeatId(), new Bill(show.getFee()));


    }

    public void payBill(Booking booking, Payment payment) {

        // validate the payment method. for given booking

        // Mark as paid.

    }
}
