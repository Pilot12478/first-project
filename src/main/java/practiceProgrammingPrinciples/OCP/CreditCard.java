package practiceProgrammingPrinciples.OCP;

public class CreditCard implements PaymentSystem{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
