package lowLevelDesign.designPatterns.observer.observer;

import lowLevelDesign.designPatterns.observer.observable.ProductObservable;

import java.util.List;

public class EmailAlertImpl implements NotificationAlertObserver {

    private List<String> email;
    private ProductObservable productObservable;

    public EmailAlertImpl(List<String> email, ProductObservable productObservable) {
        this.email = email;
        // product observable can be used to get info regarding stock count and etc
        this.productObservable = productObservable;
    }

    @Override
    public void update() {
        System.out.println("Sending Email update !");
        sendEmail(email, "Product back in stock");
    }

    private void sendEmail(List<String> emails, String productBackInStock) {
        emails.forEach(email -> {
            System.out.println("Email Alert sent to " + email);

        });
    }
}
