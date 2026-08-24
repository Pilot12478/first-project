package PracticePatterns.AbstractFactoryFurniture;

public class ClassicChair implements  Chair{
    @Override
    public void sitOn() {
        System.out.println("Сесть на классический стул");
    }
}
