package lowLevelDesign.carRentalSystem.models;

import lowLevelDesign.carRentalSystem.VehicleInventory;
import lowLevelDesign.carRentalSystem.models.Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private Integer storeId;
    private VehicleInventory inventory;
    private List<Reservation> reservationList;
    private Location location;

    public Store(Integer storeId, VehicleInventory inventory, Location location) {
        this.inventory = inventory;
        this.storeId = storeId;
        this.location = location;
        reservationList = new ArrayList<>();
    }

    public VehicleInventory getInventory() {
        return inventory;
    }

    public void setInventory(VehicleInventory inventory) {
        this.inventory = inventory;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Reservation makeReservation(Vehicle vehicle, User user, ReservationType type) {
        Reservation reservation = new Reservation();
        Integer reservationId = reservation.createReserve(user, vehicle, type);
        System.out.println("Reservation made !.  Id is  " + reservationId);
        reservationList.add(reservation);
        return reservation;
    }

    public Bill generateBill(Reservation reservation) {
        Bill bill = new Bill(reservation, 12312312) ;

        System.out.println("Bill Generated !!");
        return bill;
    }

    public void completeReservation(Integer reservationId) {
        // filter reservation and and the completeReservation() method in Reservation class.
        System.out.println("Completed Reservation");
    }
}
