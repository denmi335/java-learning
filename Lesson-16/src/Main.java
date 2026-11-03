import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Тестовые данные
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("Иван", "Мария", "Петр", "Анна");

        System.out.println("Тест 1: filterByPredicate");
        // Фильтрация чётных чисел
        List<Integer> even = LambdaExample.filterByPredicate(numbers, n -> n % 2 == 0);
        System.out.println("Чётные: " + even);

        // Фильтрация чисел больше 5
        List<Integer> greaterThan5 = LambdaExample.filterByPredicate(numbers, n -> n > 5);
        System.out.println("Больше 5: " + greaterThan5);

        System.out.println("\nТест 2: transformList");
        // Преобразование в квадраты
        List<Integer> squares = LambdaExample.transformList(numbers, n -> n * n);
        System.out.println("Квадраты: " + squares);

        // Преобразование строк в верхний регистр
        List<String> upperNames = LambdaExample.transformList(names, String::toUpperCase);
        System.out.println("Верхний регистр: " + upperNames);

        System.out.println("\nТест 3: processList");
        // Вывод каждого элемента
        System.out.println("Вывод чисел:");
        LambdaExample.processList(numbers, System.out::println);

        // Вывод с префиксом
        System.out.println("\nВывод имён с префиксом:");
        LambdaExample.processList(names, name -> System.out.println("Имя: " + name));

        System.out.println("\nТест 4: createList");
        // Создание нового списка
        List<String> newList = LambdaExample.createList(ArrayList::new);
        newList.add("Иван");
        newList.add("Мария");
        System.out.println("Новый список: " + newList);

        System.out.println("\n=== Все тесты пройдены! ===");
    }
}