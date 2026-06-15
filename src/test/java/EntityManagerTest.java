
import complexTask1.EntityManager;
import complexTask1.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    EntityManager<Student> entityManager;

    @BeforeEach
    public void setUp() {
        entityManager = new EntityManager<>();
    }

    public List<Student>prepareTestData(){
        Student student1 = new Student("Вася",32,false);
        Student student2 = new Student("Петя",22,false);
        Student student3 = new Student("Коля",31,true);
        Student student4 = new Student("Юра",40,true);
        Student student5 = new Student("Мераб",34,true);
        entityManager.add(student1);
        entityManager.add(student2);
        entityManager.add(student3);
        entityManager.add(student4);
        entityManager.add(student5);
        return entityManager.getAll();

    }

    @Test
    @DisplayName("Проверка успешного добавления элемента в коллекцию")
    public void addSuccessTest() {
        Student student1 = new Student("Вася", 20, true);
        entityManager.add(student1);
        int expSizeOfList = 1;
        assertAll(
                () -> assertEquals(expSizeOfList, entityManager.getAll().size()),
                () -> assertEquals(student1, entityManager.getAll().getFirst())
        );
    }

    @Test
    @DisplayName("Проверка успешного удаления элемента из коллекции")
    public void removeSuccessTest() {
        Student student1 = new Student("Вася", 20, true);
        entityManager.add(student1);
        entityManager.remove(student1);
        assertTrue(entityManager.getAll().isEmpty());
    }
    @Test
    @DisplayName("Проверка успешной фильтрации по возрасту")
    public void filterByAgeSuccessTest(){
        List<Student>listExp = prepareTestData().subList(3,5);
        assertIterableEquals(listExp,entityManager.filterByAge(34,50));
    }

    @Test
    @DisplayName("Проверка получения пустого списка, если в переданном диапозоне объектов не найдено")
    public void emptyListByAgeDiapasonTest(){
        prepareTestData();
        List<Student>listExp = List.of();
        assertIterableEquals(listExp,entityManager.filterByAge(-2,16));
    }
    @Test
    @DisplayName("Проверка успешной фильтрации по имени")
    public void filterByNameSuccessTest(){
        List<Student>listExp = prepareTestData().subList(0,1);
        assertIterableEquals(listExp,entityManager.filterByName("Вася"));
    }
    @Test
    @DisplayName("Проверка получения пустого списка, если объектов с переданным name не найдно")
    public void emptyListByNameTest(){
        prepareTestData();
        List<Student>listExp = List.of();
        assertIterableEquals(listExp,entityManager.filterByName("Иоганн"));
    }
    @Test
    @DisplayName("Проверка получения пустого списка, если передан null")
    public void emptyListByNameNullTest(){
        prepareTestData();
        List<Student>listExp = List.of();
        assertIterableEquals(listExp,entityManager.filterByName(null));
    }
    @Test
    @DisplayName("Проверка успешнго получения активных пользователей")
    public void getActiveUsersSuccessTest(){
        List<Student>explist = prepareTestData().subList(2,5);
        System.out.println(explist);
        assertEquals(explist,entityManager.filterByActivity(true));
    }
    @Test
    @DisplayName("Проверка успешнго получения неактивных пользователей")
    public void getNoActiveUsersSuccessTest(){
        List<Student>explist = prepareTestData().subList(0,2);
        assertEquals(explist,entityManager.filterByActivity(false));
    }

}
