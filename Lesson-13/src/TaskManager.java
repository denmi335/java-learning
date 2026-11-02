import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
public class TaskManager {
    private Map<Integer, Task> tasks;
    private int nextId;
    public TaskManager(){
        this.tasks = new HashMap<>();
        this.nextId = 1;
    }
    public void addTask(String title, int priority) {
        Task task = new Task(nextId, title, priority);
        tasks.put(nextId, task);
        System.out.println("Задача добавлена: " + title);
        nextId++;
    }
    public void removeTask(int id) {
        if (tasks.containsKey(id)) {
            tasks.remove(id);
            System.out.println("Задача удалена");
        } else {
            System.out.println("Задача не найдена");
        }
    }
    public void completeTask(int id) {
        Task task = tasks.get(id);
        if (task != null) {
            task.setCompleted(true);
            System.out.println("Задача выполнена: " + task.getTitle());
        } else {
            System.out.println("Задача не найдена");
        }
    }
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }
    public int getTaskCount() {
        return tasks.size();
    }
    public void loadFromFile() {
        Path path = Paths.get("todos.txt");

        if (!Files.exists(path)) {
            System.out.println("Файл не найден, начинаем с пустого списка");
            return;
        }

        try {
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                // Разделяем строку по |
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                boolean isDone = Boolean.parseBoolean(parts[2]);
                int priority = Integer.parseInt(parts[3]);

                // Создаём задачу
                Task task = new Task(id, title, priority);
                if (isDone) {
                    task.setCompleted(true);
                }

                // Добавляем в map
                tasks.put(id, task);

                // Обновляем nextId
                if (id >= nextId) {
                    nextId = id + 1;
                }
            }

            System.out.println("Загружено задач: " + tasks.size());

        } catch (IOException e) {
            System.out.println("Ошибка загрузки: " + e.getMessage());
        }
    }
    public void saveToFile() {
        List<String> lines = new ArrayList<>();

        for (Task task : tasks.values()) {
            // Создаём строку: id|title|isDone|priority
            String line = task.getId() + "|" +
                    task.getTitle() + "|" +
                    task.isDone() + "|" +
                    task.getPriority();
            lines.add(line);
        }

        // Записываем в файл
        Path path = Paths.get("todos.txt");
        try {
            Files.write(path, lines);
            System.out.println("Задачи сохранены в файл");
        } catch (IOException e) {
            System.out.println("Ошибка сохранения: " + e.getMessage());
        }
    }

}
