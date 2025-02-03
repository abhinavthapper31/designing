package lowLevelDesign.designPatterns.dependencyInjection;

public class NotificationService {

    private NotificationSender notificationSender;

    NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void notifyUser(String message, String recipient) {
        notificationSender.sendNotification(recipient, message);
    }

}
