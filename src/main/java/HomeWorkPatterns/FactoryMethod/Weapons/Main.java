package HomeWorkPatterns.FactoryMethod.Weapons;

public class Main {
    static void main() {
        WeaponFactory weaponFactory = new GunFactory();
        weaponFactory.strike();
    }
}
