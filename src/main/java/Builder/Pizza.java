package Builder;

public class Pizza {
    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", pepperoni=" + pepperoni +
                ", dough='" + dough + '\'' +
                ", cheese=" + cheese +
                ", mushrooms=" + mushrooms +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    // Обязательные параметры
    private final String size;          // "Small", "Medium", "Large"
    private final String dough;         // "Thin", "Thick"

    // Опциональные параметры (с значениями по умолчанию)
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;
    private final String sauce;         // "Tomato", "BBQ", null если без соуса

    // Приватный конструктор, который принимает Builder
    private Pizza(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        this.sauce = builder.sauce;
    }
    public static class Builder{
        // Обязательные параметры
        private final String size;
        private final String dough;

        // Опциональные параметры с дефолтными значениями
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean mushrooms = false;
        private String sauce = null;

        public Builder(String size,String dough){
            this.size = size;
            this.dough = dough;
        }

        public Builder cheese(){
            this.cheese =true;
            return this;
        }
        public Builder pepperoni(){
            this.pepperoni = true;
            return this;
        }
        public Builder mushrooms(){
            this.mushrooms =true;
            return this;
        }


        public Builder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}
