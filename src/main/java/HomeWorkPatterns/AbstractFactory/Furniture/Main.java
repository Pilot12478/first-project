package HomeWorkPatterns.AbstractFactory.Furniture;

public class Main {
    static void main() {
        Furniture furniture = new ModernFurniture();
        Chair chair = furniture.getChair();
        Table table = furniture.getTable();
        chair.sitOn();
        table.use();
    }
}
