import complexTask6.Task;
import complexTask6.TaskService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    TaskService<Integer> taskService;
    List<Task<Integer>> expectedListAfterFilteringByStatus;
    List<Task<Integer>> expectedListAfterFilteringByPriority;
    List<Task<Integer>> expectedListAfterSortingByDate;

    @BeforeEach
    public void setUp() {
        taskService = new TaskService<>();
    }

    public void testDataForFilteringAndSorting(){
        Task<Integer> task1 = new Task<>(12323141, "inProgress", "se1", "10.12.2025");
        Task<Integer> task2 = new Task<>(1233141, "ready", "se2", "14.12.2023");
        Task<Integer> task3 = new Task<>(1266141, "done", "se3", "13.12.2021");
        Task<Integer> task4 = new Task<>(12565141, "ready", "se1", "11.12.2024");
        Task<Integer> task5 = new Task<>(42323141, "inProgress", "se2", "21.12.2027");
        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);
        taskService.addTask(task4);
        taskService.addTask(task5);

        expectedListAfterFilteringByStatus = new CopyOnWriteArrayList<>();
        expectedListAfterFilteringByStatus.add(task2);
        expectedListAfterFilteringByStatus.add(task4);

        expectedListAfterFilteringByPriority = new CopyOnWriteArrayList<>();
        expectedListAfterFilteringByPriority.add(task2);
        expectedListAfterFilteringByPriority.add(task5);

        expectedListAfterSortingByDate = new CopyOnWriteArrayList<>();
        expectedListAfterSortingByDate.add(task3);
        expectedListAfterSortingByDate.add(task2);
        expectedListAfterSortingByDate.add(task4);
        expectedListAfterSortingByDate.add(task1);
        expectedListAfterSortingByDate.add(task5);
    }


    @Test
    @DisplayName("Проверка успешного добавления задачи")
    public void addTaskWithNotExistedIdSuccessTest() {
        Task<Integer> task = new Task<>(12323141, "inProgress", "se", "11.12.2024");
        taskService.addTask(task);
        int expSize = 1;
        assertAll(
                () -> assertEquals(expSize, taskService.getList().size()),
                () -> assertEquals(task, taskService.getList().getFirst())
        );
    }

    @Test
    @DisplayName("Проверка ошибки при добавлении задачи с уже существующим id")
    public void addTaskWithExistedIdFailedTest() {
        Task<Integer> task = new Task<>(12323141, "inProgress", "se", "11.12.2024");
        taskService.addTask(task);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> taskService.addTask(task));
        assertEquals("Task with this id " + task.getId() + " already exist", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка ошибки при добавлении задачи null")
    public void addNullTaskTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> taskService.addTask(null));
        assertEquals("Task can't be null", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка ошибки при удалении задачи null")
    public void removeNullTaskTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> taskService.removeTask(null));
        assertEquals("id can't be null", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка успешного удаление задачи с существующим id")
    public void removeTaskWithExistedIdFailedTest() {
        Task<Integer> task = new Task<>(12323141, "inProgress", "se", "11.12.2024");
        taskService.addTask(task);
        int expSize = 0;
        assertAll(
                () -> assertTrue(taskService.removeTask(12323141)),
                () -> assertEquals(expSize, taskService.getList().size()),
                () -> assertTrue(taskService.getList().isEmpty())
        );
    }
    @Test
    @DisplayName("Проверка удаления задачи, которая не существует в структуре данных")
    public void removeTaskWithNotExistedIdFailedTest() {
        assertFalse(taskService.removeTask(3223));
    }

    @Test
    @DisplayName("Проверка усепшной фильтрации по статусу")
    public void filteringByStatusSuccessTest(){
        testDataForFilteringAndSorting();
        assertIterableEquals(expectedListAfterFilteringByStatus, taskService.getTaskByStatus("ready"));
    }

    @Test
    @DisplayName("Проверка усепшной фильтрации по приоритету")
    public void filteringByPrioritySuccessTest(){
        testDataForFilteringAndSorting();
        assertIterableEquals(expectedListAfterFilteringByPriority, taskService.getTaskByPriority("se2"));
    }
    @Test
    @DisplayName("Проверка успешной сортировки по дате")
    public void sortingByDateSuccessTest(){
        testDataForFilteringAndSorting();
        assertIterableEquals(expectedListAfterSortingByDate, taskService.sortingByDate());
    }

}
