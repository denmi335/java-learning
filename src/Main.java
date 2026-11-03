public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Возраст", 25);
        System.out.println(pair1);

        Pair<Integer, String> pair2 = Pair.of(1, "Первый");
        System.out.println(pair2);

        pair1.setValue(30);//
        System.out.println(pair1);

        String key = pair1.getKey();
        Integer value = pair1.getValue();

        System.out.println("Ключ: " + key);
        System.out.println("Значение: " + value);

        Pair<String, Boolean> pair3 = Pair.of("Активен", true);
        System.out.println(pair3);

        Pair<Double, String> pair4 = Pair.of(3.14, "Пи");
        System.out.println(pair4);
    }
}