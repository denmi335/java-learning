import java.io.File;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class TodoList {
    static Path file = Path.of("todos.txt");
    static List<String> todos = new ArrayList<>();

    public static void main(String[] args) {
        loadTodos();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            showTodos();
            showMenu();

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addTodo(scanner);
                    break;
                case "2":
                    removeTodo(scanner);
                    break;
                case "3":
                    saveTodos();
                    running = false;
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }
        }

        scanner.close();
    }

    static void loadTodos() {
        try {
            String contente = Files.readString(Path.of("todos.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void saveTodos() {

    }

    static void showTodos() {
        // Показать все задачи
    }

    static void showMenu() {
        // Показать меню
    }

    static void addTodo(Scanner scanner) {

    }

    static void removeTodo(Scanner scanner) {
        // Удалить задачу
    }
}