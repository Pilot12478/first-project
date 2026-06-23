package complexTask6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public class TaskService<T> {
    List<Task<T>> listOfTasks;

    public TaskService() {
        listOfTasks = new CopyOnWriteArrayList<>();
    }

    public void addTask(Task<T> task) {
        if (task == null) {
            throw new IllegalArgumentException("Task can't be null");
        }
        listOfTasks.forEach(task1 -> {
            if (task.getId().equals(task1.getId())) {
                throw new IllegalArgumentException("Task with this id " + task.getId() + " already exist");
            }
        });
        listOfTasks.add(task);
    }

    public boolean removeTask(T id) {
        if (id == null) {
            throw new IllegalArgumentException("id can't be null");
        }
        return listOfTasks.removeIf(task -> task.getId().equals(id));
    }

    public List<Task<T>> getTaskByStatus(String status) {
        if (status == null || status.isEmpty()) {
            throw new IllegalArgumentException("Status can't be null or empty");
        }
        return listOfTasks.stream().filter(task -> task.getStatus().equals(status)).toList();
    }

    public List<Task<T>> getTaskByPriority(String priority) {
        if (priority == null || priority.isEmpty()) {
            throw new IllegalArgumentException("Priority can't be null or empty");
        }
        return listOfTasks.stream().filter(task -> task.getPriority().equals(priority)).toList();
    }

    static void main() {
        TaskService<Integer> taskService = new TaskService<>();
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
        System.out.println(taskService.sortingByDate());
    }

    public List<Task<T>> sortingByDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        return listOfTasks.stream().sorted(Comparator.comparing((Task<T> task) -> LocalDate.parse(task.getDate(), formatter)).reversed()).toList();
    }
    public List<Task<T>> getList(){
        return List.copyOf(listOfTasks);
    }
}
