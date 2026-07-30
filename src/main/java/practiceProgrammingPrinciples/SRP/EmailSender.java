package practiceProgrammingPrinciples.SRP;

public class EmailSender {
    public void sendEmailConfirmation(User user, Order order) {
        System.out.println("Отправляем письмо клиенту " + user.getEmail()+" по заказу " +order.getId());
    }
}
