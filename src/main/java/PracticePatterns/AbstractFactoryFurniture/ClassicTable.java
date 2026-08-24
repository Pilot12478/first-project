package PracticePatterns.AbstractFactoryFurniture;

public class ClassicTable implements Table{
    @Override
    public void use() {
        System.out.println("Использовать классический стол");
    }
}
