package PracticePatterns.AbstractFactoryFurniture;

public class FurnitureStore {
    private Chair chair;
    private Table table;
    public FurnitureStore(furniture furniture){
        this.chair = furniture.getChair();
        this.table = furniture.getTable();
    }

    public void demonstrate(){
        chair.sitOn();
        table.use();
    }

}
