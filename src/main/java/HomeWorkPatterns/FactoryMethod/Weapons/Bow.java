package HomeWorkPatterns.FactoryMethod.Weapons;

public class Bow implements Weapon{
    @Override
    public void use() {
        System.out.println("Выстрелить из лука");
    }
}
