package practiceProgrammingPrinciples.DIP;

public class NotificationService {
    private final NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.notify(message);
    }

    static void main() {
        EmailSender emailSender = new EmailSender();
        NotificationService notificationService = new NotificationService(emailSender);
        notificationService.sendNotification("Hello World!!!");
        //вывод Отправка email: Hello World!!!
    }
}
