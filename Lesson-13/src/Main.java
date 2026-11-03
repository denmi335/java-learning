public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.loadFromFile();

        manager.addTask("Изучить Java", 5);
        manager.addTask("Написать код", 4);

        manager.completeTask(1);

        System.out.println("\n=== Все задачи ===");
        for (Task task : manager.getAllTasks()) {
            System.out.println(task);
        }

        manager.saveToFile();

        System.out.println("\nВсего задач: " + manager.getTaskCount());
    }
}