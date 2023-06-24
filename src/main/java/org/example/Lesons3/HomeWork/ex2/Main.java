package org.example.Lesons3.HomeWork.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product2 product1 = new Product2("Миндаль", "Вьетнам", 50, 110, 1);
        Product2 product2 = new Product2("Лимоны", "Узбекистан", 100, 50, 2);
        Product2 product3 = new Product2("Зефирки", "Россия", 30, 50, 2);
        Product2 product4 = new Product2("Мармелад", "Италия", 85, 200, 3);
        Product2 product5 = new Product2("Манго", "Тайланд", 50, 100, 2);
        Product2 product6 = new Product2("Ваниль", "Тай", 200, 116, 1);
        Product2 product7 = new Product2("Яблоки", "Индия", 55, 89, 3);
        Product2 product8 = new Product2("Финики", "Вьетнам", 165, 43, 1);
        List<Product2> product2List = new ArrayList<>();
        product2List.add(product1);
        product2List.add(product2);
        product2List.add(product3);
        product2List.add(product4);
        product2List.add(product5);
        product2List.add(product6);
        product2List.add(product7);
        product2List.add(product8);
        System.out.println("product2List = " + product2List);
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите сорт товара от 1 до 3: ");
        String sorted = scanner.nextLine();
        int minPrice = product2List.get(0).getPrice();
        int ourSort = 0;
        boolean flag = true;
        while (flag) {
            try {
                if (Integer.parseInt(sorted) > 0 && Integer.parseInt(sorted) <= 3) {
                    flag = false;
                    ourSort = Integer.parseInt(sorted);
                }
            } catch (NumberFormatException e) {
                System.out.println("Такого сорта нет");
            }
        }
        scanner.close();
        for (Product2 product : product2List) {
            if (product.getSort().equals(ourSort)) {
                if (product.getPrice() < minPrice) {
                    minPrice = product.getPrice();
                }
            }
        }
        StringBuilder minNames = new StringBuilder();
        for (Product2 product : product2List) {
            if (product.getSort().equals(ourSort) && (product.getPrice() == minPrice)) {
                minNames.append(product.getName()).append("\n");
            }
        }
        System.out.println("Получить наименования товаров заданного сорта с наименьшей ценой.");
        System.out.println(minNames + "---- \n" + minPrice);
    }
}
