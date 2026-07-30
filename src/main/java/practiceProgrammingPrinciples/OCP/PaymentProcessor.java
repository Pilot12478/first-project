package practiceProgrammingPrinciples.OCP;

public class PaymentProcessor {
    PaymentSystem paymentSystem;

    public PaymentProcessor(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void processPayment(double amount) {
        paymentSystem.pay(amount);
    }


}
