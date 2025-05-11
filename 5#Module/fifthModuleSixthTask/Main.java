package fifthModuleSixthTask;

public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        email.send("This is an email notification.");

        LegacySMS legacySMS = new LegacySMS();
        Notification sms = new SMSNotificationAdapter(legacySMS);

        sms.send("This is an SMS notification.");
    }
}
