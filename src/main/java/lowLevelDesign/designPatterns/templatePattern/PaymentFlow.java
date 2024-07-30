package lowLevelDesign.designPatterns.templatePattern;

public abstract class PaymentFlow {

    public abstract void initiatePayment();

    public abstract void validatePaymentRequest();

    public abstract void debitAmount();

    public abstract void creditAmount();

    public void makePayment() {

        // to make payment all classes have to call this common makePayment fn this will make them follow same
        // steps.
        // But implementation is dependent on them as methods are abstract
        initiatePayment();

        validatePaymentRequest();

        debitAmount();

        creditAmount();
    }

}
