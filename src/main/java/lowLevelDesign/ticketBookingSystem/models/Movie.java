package lowLevelDesign.ticketBookingSystem.models;

public class Movie {

    private Integer id;

    private String name;

    private Integer duration;

    private Integer ticketCost;

    public Movie(Integer id, String name, Integer duration, Integer ticketCost) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.ticketCost = ticketCost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(Integer ticketCost) {
        this.ticketCost = ticketCost;
    }
}
