package PracticePatterns.Weapons;

public class BowCreator extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}
