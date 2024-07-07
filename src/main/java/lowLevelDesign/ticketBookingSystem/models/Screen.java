package lowLevelDesign.ticketBookingSystem.models;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private Integer id;
    private List<Seat> seats;

    public Screen(Integer id) {
        this.id = id;
        List<Seat> seats = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            seats.add(new Seat(1 + i));
        }
        this.seats = seats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
