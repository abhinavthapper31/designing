package lowLevelDesign.ticketBookingSystem.models;

public class Payment {
    private Integer paymentId ;
    private  PaymentMode mode;
    private Bill bill;

    public Payment(Integer paymentId, PaymentMode mode, Bill bill) {
        this.paymentId = paymentId;
        this.mode = mode;
        this.bill = bill;
    }
}
