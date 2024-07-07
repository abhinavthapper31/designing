package lowLevelDesign.ticketBookingSystem.models;

import java.util.List;

public class Theatre {

    private Integer theatreId;
    private String name;
    private List<Screen> screenList;
    private List<Show> showList;

    public Theatre(Integer theatreId, String name, List<Screen> screenList, List<Show> showList) {
        this.theatreId = theatreId;
        this.name = name;
        this.screenList = screenList;
        this.showList = showList;
    }

    public Integer getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Integer theatreId) {
        this.theatreId = theatreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
