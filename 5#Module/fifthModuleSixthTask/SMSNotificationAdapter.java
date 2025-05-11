package fifthModuleSixthTask;

public class SMSNotificationAdapter implements Notification {
    private LegacySMS smsService;

    public SMSNotificationAdapter(LegacySMS smsService) {
        this.smsService = smsService;
    }

    @Override
    public void send(String message) {
        smsService.sendMessage(message, "+1234567890");
    }
}
