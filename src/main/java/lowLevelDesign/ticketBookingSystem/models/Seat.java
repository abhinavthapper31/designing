package lowLevelDesign.ticketBookingSystem.models;

public class Seat {
    private Integer seatId;
    private boolean isBooked;

    public Seat(Integer seatId) {
        this.seatId = seatId;
        this.isBooked = false;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
