package PracticePatterns.AbstractFactoryIcons;

public class WindowsWindow implements Window{
    @Override
    public void draw() {
        System.out.println("Отобразилось окно Windows");
    }
}
