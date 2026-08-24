package HomeWorkPatterns.AbstractFactory.Furniture;

public class ClassicTable implements Table{
    @Override
    public void use() {
        System.out.println("Воспользовался классическим столом");
    }
}
