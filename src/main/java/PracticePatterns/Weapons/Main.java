package PracticePatterns.Weapons;

public class Main {
    static void main() {
        WeaponFactory weaponFactory = new BowCreator();
        weaponFactory.strike();
    }
}
