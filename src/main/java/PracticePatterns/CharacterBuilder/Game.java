package PracticePatterns.CharacterBuilder;

public class Game {
    public Character createWarrior(){
        return new Character.CharacterBuilder().
                chooseArmor(100).
                chooseDamage(100).
                choseHealth(80).
                build();
    }
    public Character createMag(){
        return new Character.CharacterBuilder().
                chooseArmor(50).
                chooseDamage(80).
                choseHealth(50).
                chooseMagic(90).
                build();
    }

    public Character createButcher(){
        return new Character.CharacterBuilder().
                chooseArmor(90).
                chooseDamage(75).
                choseHealth(32).
                chooseMagic(10).
                build();
    }
}
