package lowLevelDesign.ticketBookingSystem.models;

public class Booking {

    private Integer id;
    private String userName;
    // other user details

    private String movieName;
    private Integer seatId;

    private Bill bill;

    public Booking() {

    }

    public Booking(Integer id, String userName, String movieName, Integer seatId, Bill bill) {
        this.id = id;
        this.userName = userName;
        this.movieName = movieName;
        this.seatId = seatId;
        this.bill = bill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
