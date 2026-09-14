public class Main {
    public static void main(String[] args) {
        int[] grades = {5, 4, 3, 5, 4, 4, 5, 3, 1, 5};

        System.out.print("Оценки: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.printf("Средний балл: %.2f%n", average);

        int max = grades[0];
        int min = grades[0];
        for (int grade : grades) {
            if (grade > max) max = grade;
            if (grade < min) min = grade;
        }
        System.out.println("Максимальная: " + max);
        System.out.println("Минимальная: " + min);

        int countFives = 0;
        for (int grade : grades) {
            if (grade == 5) countFives++;
        }
        System.out.println("Количество пятёрок: " + countFives);
    }
}