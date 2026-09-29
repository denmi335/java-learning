import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.print("Введите операцию (+, -, *, /): ");
            String op = scanner.nextLine();

            int result;
            switch (op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/": result = a / b; break;
                default: throw new IllegalArgumentException("Неверная операция!");
            }

            System.out.println("Результат: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: это не число!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Спасибо за использование!");
            scanner.close();
        }
    }
}