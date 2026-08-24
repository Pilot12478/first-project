package PracticePatterns.AbstractFactoryIcons;

public class MacWindow implements Window{
    @Override
    public void draw() {
        System.out.println("Отобразилось окно Мак");
    }
}
