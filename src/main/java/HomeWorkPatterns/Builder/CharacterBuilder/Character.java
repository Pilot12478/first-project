package HomeWorkPatterns.Builder.CharacterBuilder;

public class Character {
    private int health;
    private int damage;
    private int magic;
    private int armor;
    private Character(CharacterBuilder characterBuilder){
        this.armor = characterBuilder.armor;
        this.damage = characterBuilder.damage;
        this.magic = characterBuilder.magic;
        this.health = characterBuilder.health;
    }

    public int getHealth() {
        return health;
    }

    public int getMagic() {
        return magic;
    }

    public int getArmor() {
        return armor;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Character{" +
                "health=" + health +
                ", damage=" + damage +
                ", magic=" + magic +
                ", armor=" + armor +
                '}';
    }
    public static class CharacterBuilder{
        private int health;
        private int damage;
        private int magic;
        private int armor;

        public CharacterBuilder(){
            this.health = 0;
            this.damage = 0;
            this.magic = 0;
            this.armor = 0;
        }
        public CharacterBuilder setHealth(int points){
            this.health = points;
            return this;
        }
        public CharacterBuilder setDamage(int points){
            this.damage = points;
            return this;
        }
        public CharacterBuilder setMagic(int points){
            this.magic = points;
            return this;
        }
        public CharacterBuilder setArmor(int points){
            this.armor = points;
            return this;
        }
        public Character build(){
            return new Character(this);
        }

    }
}
