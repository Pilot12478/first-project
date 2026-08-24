package PracticePatterns.AbstractFactoryIcons;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Клик по кнопке виндовс");
    }
}
