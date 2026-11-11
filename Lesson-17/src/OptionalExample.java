import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

public class OptionalExample {
    public static String getUserName(User user) {
        return Optional.ofNullable(user)
                .map(User::getName)
                .orElse("Неизвестно");
    }
    public static int getUserNameLength(User user){
        return Optional.ofNullable(user)
                .map(User::getName)
                .map(String::length)
                .orElse(0);

    }
    public static List<User>getAdultUsers(List<User>users){
        return users.stream()
                .filter(user -> user.getAge()>=18)
                .collect(Collectors.toList());
    }
}
