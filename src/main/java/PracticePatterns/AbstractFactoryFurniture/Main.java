package PracticePatterns.AbstractFactoryFurniture;

public class Main {

    static void main() {
        furniture furniture = new ClassicFurniture();
        FurnitureStore furnitureStore = new FurnitureStore(furniture);
        furnitureStore.demonstrate();
    }
}
