package HomeWorkPatterns.AbstractFactory.Furniture;

public class ModernFurniture implements Furniture{
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }
}
