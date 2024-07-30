package lowLevelDesign.designPatterns.observer;

import lowLevelDesign.designPatterns.observer.observable.GymBagObservable;
import lowLevelDesign.designPatterns.observer.observable.ProductObservable;
import lowLevelDesign.designPatterns.observer.observer.EmailAlertImpl;
import lowLevelDesign.designPatterns.observer.observer.SMSAlertImpl;

public class App {
    public static void main(String[] args) {
        // Like a notify me feature in Amazon when the product is out of stock
        // Basically 2 feature, Observer and Observable. Observers watch Observable
        // when the state of Observable changes, we notify all the subscribed Observers.

        ProductObservable gymBagObservable = new GymBagObservable();
//        gymBagObservable.addObserver(new EmailAlertImpl("abc@gmail .com",gymBagObservable));
//        gymBagObservable.addObserver(new EmailAlertImpl("xzzzxzz@gmai.com",gymBagObservable));
//        gymBagObservable.addObserver(new EmailAlertImpl("jsadhgfdsa@gmai.com",gymBagObservable));
//
//
//        gymBagObservable.addObserver(new SMSAlertImpl("98u23143124",gymBagObservable));
//        gymBagObservable.addObserver(new SMSAlertImpl("98734213",gymBagObservable));

        gymBagObservable.updateStockCount(100);
    }
}
