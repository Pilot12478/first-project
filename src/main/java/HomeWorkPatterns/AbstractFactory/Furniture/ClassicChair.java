package HomeWorkPatterns.AbstractFactory.Furniture;

public class ClassicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сел на классический стул");
    }
}
