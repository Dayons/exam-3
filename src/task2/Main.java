package task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку чисел: ");
        String s1 = scanner.nextLine();

        System.out.print("Введите вторую строку чисел: ");
        String s2 = scanner.nextLine();

        scanner.close();

        findAndPrintCommonNumbers(s1, s2);
    }

    private static void findAndPrintCommonNumbers(String input1, String input2) {
        String[] numbers1 = input1.split(" ");
        String[] numbers2 = input2.split(" ");

        Set<String> setFirst = new HashSet<>();
        Set<String> setSecond = new HashSet<>();

        for (String number : numbers1) {
            setFirst.add(number);
        }

        for (String number : numbers2) {
            setSecond.add(number);
        }

        Set<String> commonNumbers = new HashSet<>(setFirst);
        commonNumbers.retainAll(setSecond);

        System.out.println("Похожие числа: " + commonNumbers);
    }
}

