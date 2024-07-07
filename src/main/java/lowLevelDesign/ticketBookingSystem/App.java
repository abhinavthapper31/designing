package lowLevelDesign.ticketBookingSystem;

import lowLevelDesign.ticketBookingSystem.models.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {


    /*
    * How to handle multiple seats booking ? Locks.
    * pessimistic vs optimisitc locking
    *
    * pessimistic -> Lock upon reading.
    *
    * Optimistic : Allows multiple users to read. Each user when reads that object
    * creates a version. When he tries to update, existing version is checked.
    * and it is matched.
    * If version matches booking is allowed. Else we give error.
    *
    * We need to free the lock after sometime. Use Redis for time via expiry.
    *
    * */
    public static void main(String[] args) {

        BookMyShowSystem system = initialize();

        Location userLocation = new Location(123121, "Delhi", "Delhi");
        User user = new User(1, "Abhinav", userLocation);

        Map<Theatre, List<Show>> theatreShowMap = system.findTheatresByNameAndLocation("In Time", userLocation.getCity());
        System.out.println("Select theatre and showId");
        System.out.println(theatreShowMap);

        Scanner sc = new Scanner(System.in);
        String theatreName = sc.next();
        Integer showId = sc.nextInt();
        Integer seatId = sc.nextInt();

        Booking booking = system.createBooking(theatreName, showId, seatId,user);

        system.payBill(booking, new Payment(1, PaymentMode.CASH,booking.getBill() ));


    }

    private static BookMyShowSystem initialize() {
        return new BookMyShowSystem();
    }

}
