package PracticePatterns.AbstractFactoryFurniture;

public class ModernChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Сесть на соврменный стул");
    }
}
