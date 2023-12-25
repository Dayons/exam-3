package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i != 4) {

            System.out.println("\nВыберите действие ");
            System.out.println("1 - Добавить товар");
        System.out.println("2 - Удалить товар");
        System.out.println("3 - Найти товар");
        System.out.println("4 - Выйти");

        int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nВведите название товара");
                    String productName = scanner.next();
                    inventory.addProduct(productName);
                    System.out.println("список товаров:\n" + inventory.product.toString());
                    break;
                case 2:
                    System.out.println("\nВведите название товара");
                    String productNameToDelete = scanner.next();
                    inventory.deleteProduct(productNameToDelete);
                    System.out.println("список товаров:\n" + inventory.product.toString());

                    break;
                case 3:
                    System.out.println("\nВведите название товара");
                    String productNameToSearch = scanner.next();
                    System.out.println(inventory.isAvailable(productNameToSearch));
                    break;
                case 4:
                    i = 4;
                    break;
                default:
                    System.out.println("Неверный ввод, попробуйте еще раз!");
            }
        }
    }
}