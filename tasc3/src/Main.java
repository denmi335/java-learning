import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число ");
        int b = scanner.nextInt();

        System.out.println("Выберите операцию +,-,*,/");
        String operation = scanner.next();

        double result = 0;
        if (operation.equals("+")){
            result = a+b;
        } else if (operation.equals("-")) {
            result = a-b;
        } else if (operation.equals("*")) {
            result = a*b;
        }else if (operation.equals("/")){
            if (b == 0) {
                System.out.println("Ошибка: деление на ноль!");
                return;
            }
            result = a/b;
        }else {
            System.out.println("Вы выбрали не верную операцию");
            return;
        }
        System.out.println("Результат: " + a + " " + operation + " " + b + " = " + result);

        scanner.close();

    }
}