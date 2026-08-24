package HomeWorkPatterns.AbstractFactory.Furniture;

public class ModernChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Сел на современный стул");
    }
}
