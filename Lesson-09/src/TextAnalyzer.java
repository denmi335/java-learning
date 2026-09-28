import java.util.Random;

public class TextAnalyzer {

    static int countWords(String text) {
        text = text.trim();
        if (text.isEmpty())
            return 0;
        return text.split("\\s+").length;   // ✅ исправлено
    }

    static int countChar(String text, char c) {
        int count = 0;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        return count;
    }

    static boolean isPalindrome(String text) {
        String cleaned = text.replace(" ", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    static String generatePassword(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        return password.toString();
    }

    static String findLongestWord(String text) {
        String[] words = text.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}