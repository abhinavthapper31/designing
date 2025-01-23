package lowLevelDesign.dependencyInjection;

public class EmailBasedNotification implements NotificationSender {

    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Sending email based comm. to " + receiver + " and message is " + message);
    }
}
