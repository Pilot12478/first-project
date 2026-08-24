package PracticePatterns.Weapons;

public class SwordCreator extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
