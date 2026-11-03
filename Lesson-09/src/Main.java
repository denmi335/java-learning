public class Main {
    public static void main(String[] args) {
        String text = "Привет мир это Java";

        System.out.println("=== Анализатор текста ===");
        System.out.println("Текст: " + text);
        System.out.println("Количество слов: " + TextAnalyzer.countWords(text));
        System.out.println("Количество 'а': " + TextAnalyzer.countChar(text, 'а'));
        System.out.println("Самое длинное слово: " + TextAnalyzer.findLongestWord(text));
        System.out.println("Палиндром: " + TextAnalyzer.isPalindrome(text));

        System.out.println("\n=== Генератор паролей ===");
        System.out.println("Пароль (8 символов): " + TextAnalyzer.generatePassword(8));
        System.out.println("Пароль (16 символов): " + TextAnalyzer.generatePassword(16));

        System.out.println("\n=== Палиндром-тест ===");
        System.out.println("\"А роза упала на лапу Азора\" → " +
                TextAnalyzer.isPalindrome("А роза упала на лапу Азора"));
        System.out.println("\"казак\" → " +
                TextAnalyzer.isPalindrome("казак"));
    }
}