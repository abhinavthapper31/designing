package lowLevelDesign.designPatterns.dependencyInjection;

public class SMSBasedNotification implements NotificationSender {
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Sending SMS based comm. to " + receiver + " and message is " + message);
    }
}
