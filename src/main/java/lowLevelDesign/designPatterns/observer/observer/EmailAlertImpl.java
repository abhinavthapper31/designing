package lowLevelDesign.designPatterns.observer.observer;

import lowLevelDesign.designPatterns.observer.observable.ProductObservable;

public class EmailAlertImpl implements NotificationAlertObserver {

    private String email;
    private ProductObservable productObservable;

    public EmailAlertImpl(String email, ProductObservable productObservable) {
        this.email = email;
        // product observable can be used to get infon regarding stock count and etc
        this.productObservable = productObservable;
    }

    @Override
    public void update() {
        System.out.println("Sending Email update !");
        sendEmail(email, "Product back in stock");
    }

    private void sendEmail(String email, String productBackInStock) {
        System.out.println("Email Alert sent to " + email);
    }
}
