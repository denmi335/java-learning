import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Создаём список студентов
        List<Student> students = Arrays.asList(
                new Student("Саша", 19, 4.5),
                new Student("Маша", 20, 3.8),
                new Student("Петя", 18, 4.2),
                new Student("Соня", 21, 4.8),
                new Student("Сергей", 19, 3.5)
        );

        System.out.println("=== Задача 1: GPA > 4.0 ===");
        List<Student> task1 = students.stream()
                .filter(student -> student.getGpa()>4.0)
                .collect(Collectors.toList());

        System.out.println(task1);

        System.out.println("\n=== Задача 2: Возраст > 19 ===");
        List<String> task2 = students.stream()
                .filter(student -> student.getAge()>19)
                .map(Student::getName)
                .collect(Collectors.toList())
                ;
        System.out.println(task2);
        System.out.println("\n=== Задача 3: Максимальный GPA ===");
        Optional<Student> task3 = students.stream()
                .max(Comparator.comparingDouble(Student::getGpa));
        task3.ifPresent(System.out::println);
        System.out.println("\n=== Задача 4: Средний возраст ===");
                double avgAge = students.stream()
                        .mapToInt(Student::getAge)
                        .average()
                        .orElse(0);
        System.out.println(avgAge);

        System.out.println("\n=== Задача 5: По алфавиту ===");
        List<String> task5 = students.stream()
                .map(Student::getName)
                .sorted()
                .toList();
        System.out.println(task5);

        System.out.println("\n=== Задача 6: Есть ли Маша? ===");
        boolean task6 = students.stream()
                .anyMatch(student -> student.getName().equals("Маша"));
        System.out.println(task6);

        System.out.println("\n=== Задача 7: По возрасту ===");
        Map<Integer, List<Student>> task7 = students.stream()
                .collect(Collectors.groupingBy(Student::getAge));
        System.out.println(task7);
    }
}