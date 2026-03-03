package practice5.task5;

public class Farm {
    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
    }

    public void manageFarmAnimal() {
        if (farmAnimal == null) {
            System.out.println("На ферме нет животных");
        } else {
            farmAnimal.feed();
            farmAnimal.produce();
        }

    }

    static void main() {
        FarmAnimal chicken = new Chicken();
        FarmAnimal cow = new Cow();
        Farm farm = new Farm();
        farm.addFarmAnimal(chicken);
        farm.manageFarmAnimal();
    }
}
