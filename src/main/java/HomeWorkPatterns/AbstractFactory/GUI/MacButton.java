package HomeWorkPatterns.AbstractFactory.GUI;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Клик по кнопке mac");
    }
}
