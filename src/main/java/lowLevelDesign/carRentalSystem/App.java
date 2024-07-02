package lowLevelDesign.carRentalSystem;

import javafx.fxml.LoadException;
import lowLevelDesign.carRentalSystem.models.*;
import lowLevelDesign.carRentalSystem.models.Product.Car;
import lowLevelDesign.carRentalSystem.models.Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // system set up
        List<Vehicle> cars = getCarsList();
        List<User> users = getUsersList();
        List<Store> stores = new ArrayList<>();
        Location storeLocation = new Location(1, 123122, "Bengaluru", "Karnataka", "India");
        stores.add(getSingleStore(cars, storeLocation));
        VehicleRentalSystem system = new VehicleRentalSystem(stores, users);

        User inputUser = new User(1, "Abhinav", "1232314123", "acabsjnd@gmail.com");
        User user = system.findUser(inputUser);
        Vehicle inputVehicle = new Car(1, "yz", "black", "Honda", "Amaze");

        Location location = new Location(1, 123122, "Bengaluru", "Karnataka", "India");

        Store filteredStore = system.findStore(location);

        Reservation reservation = filteredStore.makeReservation(inputVehicle,user, ReservationType.DAILY) ;

        Bill bill =  filteredStore.generateBill(reservation) ;




        //5. make payment
        Payment payment = new Payment();
        payment.payBill(bill, PaymentMode.CASH);

        //6. trip completed, submit the vehicle and close the reservation
        filteredStore.completeReservation(reservation.getReservationId());



    }

    private static Store getSingleStore(List<Vehicle> cars, Location location) {
        return new Store(1, new VehicleInventory(cars), location);
    }

    private static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Abhinav", "1232314123", "acabsjnd@gmail.com"));
        users.add(new User(2, "Megha", "1232314123", "acabsjnd@gmail.com"));
        users.add(new User(3, "Raj", "1232314123", "acabsjnd@gmail.com"));
        return users;
    }

    private static List<Vehicle> getCarsList() {
        List<Vehicle> cars = new ArrayList<>();
        cars.add(new Car(1, "yz", "black", "Honda", "Amaze"));
        cars.add(new Car(2, "yasdkjnasz", "blue", "Maruti", "Brezza"));

        return cars;
    }

}
