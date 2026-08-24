package HomeWorkPatterns.FactoryMethod.Weapons;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon();

    public void strike(){
        Weapon weapon = createWeapon();
        weapon.use();
    }
}
