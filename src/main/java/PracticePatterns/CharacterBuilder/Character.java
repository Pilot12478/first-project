package PracticePatterns.CharacterBuilder;

import Builder.Pizza;

public class Character {
    private int health;
    private int damage;
    private int armor;
    private int magic;


    private Character(CharacterBuilder builder) {
        this.health = builder.health;
        this.damage = builder.damage;
        this.magic = builder.magic;
        this.armor = builder.armor;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getMagic() {
        return magic;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Character{" +
                "health='" + health + '\'' +
                ", armor='" + armor + '\'' +
                ", magic='" + magic + '\'' +
                ", damage='" + damage + '\'' +
                '}';
    }

    public static class CharacterBuilder {
        private int health;
        private int damage;
        private int armor;
        private int magic;

        public CharacterBuilder chooseArmor(int armor) {
           this.armor = armor;
           return this;
        }

        public CharacterBuilder chooseMagic(int magic) {
           this.magic = magic;
           return this;
        }

        public CharacterBuilder chooseDamage(int damage) {
           this.damage = damage;
            return this;
        }

        public CharacterBuilder choseHealth(int health) {
           this.health = health;
           return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
