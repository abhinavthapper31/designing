package lowLevelDesign.carRentalSystem.models;

import lowLevelDesign.carRentalSystem.models.Product.Vehicle;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {

    private Integer reservationId;
    private LocalTime reservationStartDateTime;
    private LocalTime reservationEndDateTime;
    private LocalTime createdAt;
    private User user;
    private Vehicle vehicle;
    private ReservationType reservationType;
    private ReservationStatus reservationstatus;


    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public LocalTime getReservationStartDateTime() {
        return reservationStartDateTime;
    }

    public void setReservationStartDateTime(LocalTime reservationStartDateTime) {
        this.reservationStartDateTime = reservationStartDateTime;
    }

    public LocalTime getReservationEndDateTime() {
        return reservationEndDateTime;
    }

    public void setReservationEndDateTime(LocalTime reservationEndDateTime) {
        this.reservationEndDateTime = reservationEndDateTime;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public ReservationStatus getReservationstatus() {
        return reservationstatus;
    }

    public void setReservationstatus(ReservationStatus reservationstatus) {
        this.reservationstatus = reservationstatus;
    }

    public Integer createReserve(User user, Vehicle vehicle, ReservationType type) {
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        this.reservationType =  type ;;
        this.reservationstatus = ReservationStatus.SCHEDULED;

        return reservationId;

    }
}
