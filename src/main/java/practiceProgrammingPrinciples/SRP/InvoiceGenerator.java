package practiceProgrammingPrinciples.SRP;

public class InvoiceGenerator {
    Order order;
    public InvoiceGenerator(Order order){
        this.order = order;
    }
    public void generateInvoice() {
        System.out.println("Генерируем счет по заказу " + this.order.getId());
    }
}
