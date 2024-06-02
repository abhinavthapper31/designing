package lowLevelDesign.designPatterns.observer.observable;


import lowLevelDesign.designPatterns.observer.observer.NotificationAlertObserver;

// Multiple products can implement this.
public interface ProductObservable {

    void addObserver(NotificationAlertObserver notificationAlertObserver);

    void deleteObserver(NotificationAlertObserver notificationAlertObserver);

    void notifyObservers();

    public void updateStockCount(int count);

    public Integer getStockCount();

}
