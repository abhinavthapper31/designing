package lowLevelDesign.designPatterns.observer.observable;

import lowLevelDesign.designPatterns.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;

public class GymBagObservable implements ProductObservable {

    private ArrayList<NotificationAlertObserver> notificationAlertObservers;
    private Integer stockCount;

    public GymBagObservable() {
        this.stockCount = 0;
        this.notificationAlertObservers = new ArrayList<>();

    }

    public GymBagObservable(Integer stockCount) {
        this.notificationAlertObservers = new ArrayList<>();
        this.stockCount = stockCount;
    }

    @Override
    public void addObserver(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.add(notificationAlertObserver);
    }

    @Override
    public void deleteObserver(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : notificationAlertObservers) {
            observer.update();
        }
    }

    public void updateStockCount(int count) {
        if (this.stockCount == 0) {
            System.out.println("Updated Stock Count ! Notifying observers!");
            this.stockCount = count;
            notifyObservers();
            return;
        }
        this.stockCount += count;
    }

    public Integer getStockCount() {
        return this.stockCount;
    }
}
