package complexTask1;

import java.util.Objects;

public abstract class Entity {
    private int age;
    private String name;
    private boolean isActive;

    public Entity(int age, String name, boolean isActive) {
        this.age = age;
        this.name = name;
        this.isActive = isActive;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public boolean isActive() {
        return this.isActive;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Entity entity = (Entity) obj;
        return entity.age == this.age && entity.name.equals(this.name) && entity.isActive == this.isActive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, isActive);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
