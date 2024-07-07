package lowLevelDesign.ticketBookingSystem.models;

public class Bill {

    private Integer billId;
    private Integer totalAmount;
    private boolean isPaid;

    public Bill(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }
}
