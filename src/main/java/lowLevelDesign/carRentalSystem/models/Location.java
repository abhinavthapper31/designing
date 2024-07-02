package lowLevelDesign.carRentalSystem.models;

public class Location {

    private Integer locationId;
    private Integer pincode;
    private String city;
    private String state;
    private String country;

    public Location(Integer locationId, Integer pincode, String city, String state, String country) {
        this.locationId = locationId;
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
