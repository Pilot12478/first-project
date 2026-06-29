package complexTask1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EntityManager<T extends Entity> {
    private CopyOnWriteArrayList<T> entities;

    public EntityManager() {
        entities = new CopyOnWriteArrayList<>();
    }

    public void add(T entity) {
        entities.add(entity);
    }

    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAll() {
        return List.copyOf(entities);
    }

    public List<T>filterByAge(int min, int max){
        return entities.stream().filter(entity->entity.getAge()>=min && entity.getAge()<=max).toList();
    }
    public List<T>filterByName(String name){
        return entities.stream().filter(entity->entity.getName().equals(name)).toList();
    }
    public List<T>filterByActivity(boolean isActive){
        return entities.stream().filter(entity->entity.isActive() ==isActive).toList();
    }



}
