package lowLevelDesign.designPatterns.observer.observer;


import lowLevelDesign.designPatterns.observer.observable.ProductObservable;

public class SMSAlertImpl implements NotificationAlertObserver {
    private String phoneNumber;
    private ProductObservable productObservable;

    public SMSAlertImpl(String phoneNumber, ProductObservable productObservable) {
        this.phoneNumber = phoneNumber;
        this.productObservable = productObservable;
    }

    @Override
    public void update() {
        System.out.println("Sending SMS update !");
        sendSMS(phoneNumber, "Product back in stock");
    }

    private void sendSMS(String phoneNumber, String msg) {
        System.out.println("SMS Alert sent to " + phoneNumber);
    }
}
