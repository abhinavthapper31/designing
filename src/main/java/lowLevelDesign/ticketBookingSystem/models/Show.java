package lowLevelDesign.ticketBookingSystem.models;

import java.time.LocalDateTime;
import java.util.List;

public class Show {

    private Integer showId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Integer> bookedSeatIds;
    private Screen screen;
    private Movie movie;
    private Integer fee;

    public Show(Integer showId, LocalDateTime startTime, LocalDateTime endTime, Screen screen, Movie movie, Integer fee) {
        this.showId = showId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.screen = screen;
        this.movie = movie;
        this.fee = fee;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public List<Integer> getBookedSeatIds() {
        return bookedSeatIds;
    }

    public void setBookedSeatIds(List<Integer> bookedSeatIds) {
        this.bookedSeatIds = bookedSeatIds;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Show{" +
                "showId=" + showId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", bookedSeatIds=" + bookedSeatIds +
                ", screen=" + screen +
                ", movie=" + movie +
                '}';
    }
}
