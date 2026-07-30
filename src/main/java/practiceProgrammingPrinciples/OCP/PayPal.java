package practiceProgrammingPrinciples.OCP;

public class PayPal implements PaymentSystem{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
