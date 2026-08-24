package PracticePatterns.Weapons;

public class GunCreator extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new gun();
    }
}
