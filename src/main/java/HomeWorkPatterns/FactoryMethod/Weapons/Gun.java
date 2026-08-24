package HomeWorkPatterns.FactoryMethod.Weapons;

public class Gun implements Weapon{
    @Override
    public void use() {
        System.out.println("Выстрелить из пистолета");
    }
}
