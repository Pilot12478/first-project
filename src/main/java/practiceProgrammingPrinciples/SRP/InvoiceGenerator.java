package practiceProgrammingPrinciples.SRP;

public class InvoiceGenerator {
    public void generateInvoice(Order order) {
        System.out.println("Генерируем счет по заказу " +order.getId());
    }
}
