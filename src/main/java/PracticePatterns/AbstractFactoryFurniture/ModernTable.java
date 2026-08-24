package PracticePatterns.AbstractFactoryFurniture;

public class ModernTable implements Table{
    @Override
    public void use() {
        System.out.println("Использовать современный стол");
    }
}
