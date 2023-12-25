package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("car", "машина");
        dictionary.put("beak", "клюв");
        dictionary.put("key", "ключ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Список слов: \ncar\nbeak\nkey");
        System.out.print("Введите слово на английском: ");
        String englishWord = scanner.nextLine();
        scanner.close();

        String translation = findTranslation(dictionary, englishWord);
        if (translation != null) {
            System.out.println("Перевод слова '" + englishWord + "': " + translation);
        } else {
            System.out.println("Перевод для слова '" + englishWord + "' не найден.");
        }
    }

    private static String findTranslation(Map<String, String> dictionary, String englishWord) {
        return dictionary.get(englishWord);
    }
}

