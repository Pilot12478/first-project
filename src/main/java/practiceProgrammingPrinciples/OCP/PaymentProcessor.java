package practiceProgrammingPrinciples.OCP;

public class PaymentProcessor {
    private final PaymentSystem paymentSystem;

    public PaymentProcessor(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void processPayment(double amount) {
        paymentSystem.pay(amount);
    }


}
