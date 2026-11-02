public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Загружаем задачи из файла
        manager.loadFromFile();

        // Добавляем новые задачи
        manager.addTask("Изучить Java", 5);
        manager.addTask("Написать код", 4);

        // Отмечаем задачу как выполненную
        manager.completeTask(1);

        // Выводим все задачи
        System.out.println("\n=== Все задачи ===");
        for (Task task : manager.getAllTasks()) {
            System.out.println(task);
        }

        // Сохраняем задачи в файл
        manager.saveToFile();

        System.out.println("\nВсего задач: " + manager.getTaskCount());
    }
}