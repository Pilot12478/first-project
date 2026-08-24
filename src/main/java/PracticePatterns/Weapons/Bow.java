package PracticePatterns.Weapons;

public class Bow implements Weapon{
    @Override
    public void hit() {
        System.out.println("Выстрел из лука");
    }
}
