public class Main {
    public static void main(String[] args) {
        int[] grades = {5, 4, 3, 5, 4, 4, 5, 3, 1, 5};
        printArray(grades);

        double average = calculateAverage(grades);
        System.out.printf("Средний балл: %.2f%n", average);


        System.out.println("Максимальная: " + findMax(grades));
        System.out.println("Минимальная: " + findMin(grades));


        System.out.println("Количество пятёрок: " + countValue(grades, 5));
    }

    static void printArray(int[] arr){
        System.out.print("Оценки: ");
        for (int i = 0;  i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static double calculateAverage(int[] arr){
        int sum = 0;
        for (int i = 0;  i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        return average;
    }
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    static int countValue(int[] arr, int value){
        int countFives = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) countFives++;
        }
        return countFives;
    }

}
