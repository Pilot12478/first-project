package PracticePatterns.AbstractFactoryFurniture;

public class ClassicFurniture implements furniture{
    @Override
    public Chair getChair() {
        return new ClassicChair();
    }

    @Override
    public Table getTable() {
        return new ClassicTable();
    }
}
