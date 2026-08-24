package HomeWorkPatterns.AbstractFactory.Furniture;

public class ModernTable  implements  Table{
    @Override
    public void use() {
        System.out.println("Воспользовался современным столом");
    }
}
