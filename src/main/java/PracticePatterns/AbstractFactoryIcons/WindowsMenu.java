package PracticePatterns.AbstractFactoryIcons;

public class WindowsMenu implements Menu{
    @Override
    public void show() {
        System.out.println("Отобразилось меню виндовс");
    }
}
