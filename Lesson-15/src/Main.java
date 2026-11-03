import java.util.List;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Чётные: " + StreamExample.getEvenNumbers(numbers));
        System.out.println("Сумма квадратов: " + StreamExample.getSumOfSquares(numbers));

        List<String> names = Arrays.asList("Иван", "Мария", "Петр", "Анна");
        System.out.println("На И: " + StreamExample.getNamesStartingWith(names, "И"));

        System.out.println("Отсортированные: " + StreamExample.getSortedUnique(Arrays.asList(3, 1, 2, 2, 3)));
    }
}