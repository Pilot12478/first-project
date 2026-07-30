package practiceProgrammingPrinciples.DIP;

public class EmailSender implements NotificationSender{
    @Override
    public void notify(String message) {
        System.out.println("Отправка email: " + message);
    }
}
