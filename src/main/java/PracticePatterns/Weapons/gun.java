package PracticePatterns.Weapons;

public class gun implements Weapon{
    @Override
    public void hit() {
        System.out.println("Выстрел из пистолета");
    }
}
