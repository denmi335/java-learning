public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        System.out.println("=== Записная книжка ===\n");

        // Добавляем контакты
        System.out.println("Добавляем контакты:");
        notebook.addContact("Саша", "+375291234567");
        notebook.addContact("Маша", "+375297654321");
        notebook.addContact("Петя", "+375291112233");
        System.out.println("Саша: +375291234567");
        System.out.println("Маша: +375297654321");
        System.out.println("Петя: +375291112233");

        // Все контакты
        System.out.println("\nВсе контакты:");
        notebook.printAll();

        // Количество
        System.out.println("\nВсего контактов: " + notebook.count());

        // Ищем телефон Маши
        System.out.println("\nИщем телефон Маши:");
        notebook.getPhone("Маша");

        // Ищем по телефону
        System.out.println("\nИщем по телефону +375291112233:");
        System.out.println(notebook.searchByPhone("+375291112233"));

        // Удаляем Петю
        System.out.println("\nУдаляем Петю...");
        notebook.deleteContact("Петя");

        // Все контакты после удаления
        System.out.println("\nВсе контакты после удаления:");
        notebook.printAll();

        // Количество после удаления
        System.out.println("\nВсего контактов: " + notebook.count());

        // Ищем несуществующий
        System.out.println("\nИщем несуществующий контакт:");
        System.out.println("Ваня → " + notebook.getPhone("Ваня"));
    }
}