package practiceProgrammingPrinciples.OCP;

public class Bitcoin implements PaymentSystem{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через Bitcoin на сумму " + amount);
    }
}
