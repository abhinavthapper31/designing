package lowLevelDesign.dependencyInjection;

public interface NotificationSender {
    void sendNotification(String receiver, String message);
}
