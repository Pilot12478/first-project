package HomeWorkPatterns.AbstractFactory.Furniture;

public class ClassicFurniture implements Furniture{
    @Override
    public Chair getChair() {
        return new ClassicChair();
    }

    @Override
    public Table getTable() {
        return new ClassicTable();
    }
}
