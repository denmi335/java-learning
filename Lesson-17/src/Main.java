import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Тест 1: getUserName
        User user1 = new User("Иван", 20);
        User user2 = null;

        System.out.println("Имя: " + OptionalExample.getUserName(user1));     // Иван
        System.out.println("Имя: " + OptionalExample.getUserName(user2));     // Неизвестно

        // Тест 2: getUserNameLength
        System.out.println("Длина: " + OptionalExample.getUserNameLength(user1));  // 4
        System.out.println("Длина: " + OptionalExample.getUserNameLength(user2));  // 0

        // Тест 3: getAdultUsers
        List<User> users = Arrays.asList(
                new User("Иван", 20),
                new User("Мария", 16),
                new User("Петр", 18)
        );

        List<User> adults = OptionalExample.getAdultUsers(users);
        System.out.println("Совершеннолетние: " + adults);
    }
}