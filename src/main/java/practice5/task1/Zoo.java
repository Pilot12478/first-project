package practice5.task1;

public class Zoo {
    private Animal animal;
    public void addAnimal(Animal animal){
        this.animal = animal;
    }
    public void showBehavior(){
        if(animal ==null){
            System.out.println("В зоопарке пока нет животных");
        }else {
            animal.sound();
            animal.move();
        }
    }

    static void main() {
        Animal bird =new Bird();
        Animal elephant = new Elephant();
        Zoo zoo = new Zoo();
        zoo.addAnimal(elephant);
        zoo.showBehavior();

    }
}
