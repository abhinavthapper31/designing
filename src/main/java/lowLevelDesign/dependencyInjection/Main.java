package lowLevelDesign.dependencyInjection;

public class Main {

    // responsibility of configuring dependency is at the caller
    // the called just executes
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailBasedNotification();
        NotificationService emailNotification = new NotificationService(emailSender);
        emailNotification.notifyUser("Hello via Email!", "user@example.com");

        // Injecting SmsSender dependency
        NotificationSender smsSender = new SMSBasedNotification();
        NotificationService smsNotification = new NotificationService(smsSender);
        smsNotification.notifyUser("Hello via SMS!", "123-456-7890");
    }

}
