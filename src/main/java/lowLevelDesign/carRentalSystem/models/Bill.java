package lowLevelDesign.carRentalSystem.models;

public class Bill {

   private  Integer billId ;
   private Double amount ;
   private Reservation reservation;

    public Bill(Reservation reservation,Integer billId ){
        this.reservation = reservation;
        this.billId = billId ;
        this.amount = computerAmount(amount);
    }

    private Double computerAmount(Double amount) {
        // do ammount computation
        return 1000.00;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
