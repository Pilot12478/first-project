package HomeWorkPatterns.Builder.CharacterBuilder;

public class Game {
    private Character.CharacterBuilder character;
    public Game(){
        character = new Character.CharacterBuilder();
    }
    public Character createWarrior(){
        return character.setDamage(80).setArmor(63).setHealth(85).build();
    }
    public Character createMag(){
        return character.setDamage(80).setArmor(20).setHealth(50).setMagic(80).build();
    }
    public Character createTank(){
        return character.setDamage(30).setArmor(120).setHealth(100).build();
    }

    static void main() {
        Game game = new Game();
        game.createTank();
        System.out.println(game.createWarrior());
    }
}
