package PracticePatterns.AbstractFactoryFurniture;

public class ModerFurniture implements furniture{
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }
}
