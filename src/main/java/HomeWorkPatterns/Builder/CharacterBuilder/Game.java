package HomeWorkPatterns.Builder.CharacterBuilder;

public class Game {
    public Character createWarrior(){
        return new Character.CharacterBuilder().setDamage(80).setArmor(63).setHealth(85).build();
    }
    public Character createMag(){
        return new Character.CharacterBuilder().setDamage(80).setArmor(20).setHealth(50).setMagic(80).build();
    }
    public Character createTank(){
        return new Character.CharacterBuilder().setDamage(30).setArmor(120).setHealth(100).build();
    }

    static void main() {
        Game game = new Game();
        System.out.println(game.createWarrior());
        System.out.println(game.createTank());
        System.out.println(game.createMag());
    }
}
