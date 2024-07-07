package lowLevelDesign.ticketBookingSystem.models;

public class Location {

    private Integer  pincode;

    private String city;

    private String state ;

    public Location(Integer pincode, String city, String state) {
        this.pincode = pincode;
        this.city = city;
        this.state = state;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
