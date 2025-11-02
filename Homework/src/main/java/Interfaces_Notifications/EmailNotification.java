package Interfaces_Notifications;

public class EmailNotification implements Notification {

    private String recipient;
    private String message;

    public EmailNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.printf("Sent email to %s: %s\n", recipient,message);
    }
}
