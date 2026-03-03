package practice5.task2;

public class PetSystem {
    private Pet pet;
    public void addPet(Pet pet){
        this.pet = pet;
    }
    public void communicate(){
        if(pet ==null){
            System.out.println("Животное еще не добавлено в систему");
        }else {
            pet.feed();
            pet.play();
        }
    }

    static void main() {
        Pet dog = new Dog();
        Pet cat = new Cat();
        PetSystem petSystem = new PetSystem();
        petSystem.addPet(dog);
        petSystem.communicate();
    }
}
