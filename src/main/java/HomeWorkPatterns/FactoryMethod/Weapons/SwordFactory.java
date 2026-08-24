package HomeWorkPatterns.FactoryMethod.Weapons;

public class SwordFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
