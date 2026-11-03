import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamExample {
    // Чётные числа
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
    }

    // Сумма квадратов
    public static int getSumOfSquares(List<Integer> numbers) {
        int sumOfSquares = numbers.stream()
                .map(n->n*n)
                .mapToInt(Integer::intValue)
                .sum();
        return sumOfSquares;
    }

    // Имена на заданную букву
    public static List<String> getNamesStartingWith(List<String> names, String letter) {
        List<String>result = names.stream()
                .filter(name -> name.startsWith(letter))
                .collect(Collectors.toList());
        return result;
    }

    // Отсортированные уникальные
    public static List<Integer> getSortedUnique(List<Integer> numbers) {
        List<Integer>result = numbers.stream()
                .distinct()
                .sorted()
                .toList();
        return result;
    }
}

