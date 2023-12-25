package task3;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>(
        );

        // Добавляем пользователей в TreeSet
        userSet.add(new User("Alex", 25));
        userSet.add(new User("Bob", 30));
        userSet.add(new User("garry", 20));

        // Выводим отсортированный список
        System.out.println("Отсортированный список:");
        printUserSet(userSet);
    }

    private static void printUserSet(Set<User> userSet) {
        for (User user : userSet) {
            System.out.println(user);
        }
    }
}