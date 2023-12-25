package task1;

import java.util.LinkedList;

public class Inventory {
    LinkedList<String> product = new LinkedList<>();

    public void addProduct(String name) {
        if (product.contains(name)) {
            System.out.println("В магазине уже имеется этот товар");
        } else {
            product.add(name);
            System.out.println("Товар успешно добавлен");
        }
    }

    public void deleteProduct(String name) {
        if (product.isEmpty()) {
            System.out.println("Список товаров пуст");
        }

            if (product.contains(name)) {
                product.remove(name);
                System.out.println("Товар успешно удален");
            }
            else {System.out.println("Название товара введено непрвильно");}
        }

        public String isAvailable (String name){
            if (product.contains(name)) {
                return "Этот товар имеется в магазине!";
            } else
                return "К сожалению у нас нет этого товара";
        }

}
