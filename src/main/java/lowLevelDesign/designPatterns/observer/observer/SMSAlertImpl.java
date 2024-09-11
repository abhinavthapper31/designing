package lowLevelDesign.designPatterns.observer.observer;


import lowLevelDesign.designPatterns.observer.observable.ProductObservable;

import java.util.List;

public class SMSAlertImpl implements NotificationAlertObserver {
    private List<String> phoneNumber;

    public SMSAlertImpl(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("Sending SMS updates !");
        sendSMS(phoneNumber, "Product back in stock");
    }

    private void sendSMS(List<String> phoneNumbers, String msg) {
        phoneNumbers.forEach(phoneNumber -> {
            System.out.println("SMS Alert sent to " + phoneNumber);
        });
    }
}
