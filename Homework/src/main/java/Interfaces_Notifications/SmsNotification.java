package Interfaces_Notifications;

public class SmsNotification implements Notification {

    private String recipient;
    private String message;

    public SmsNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.printf("Sent SMS to %s: %s\n", recipient, message);
    }
}
