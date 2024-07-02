package lowLevelDesign.carRentalSystem.models;

import lowLevelDesign.carRentalSystem.PaymentMode;

public class Payment {
    Integer paymentId;

    public void payBill(Bill bill, PaymentMode mode) {
        System.out.println("payment mode is  " + mode);

        System.out.println("payment made for billId " + bill.getBillId());

    }
}
