package org.example.Lesons3.HomeWork.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Штрудель высший сорт", 50, 1);
        Product product2 = new Product("Наполеон", 60, 2);
        Product product3 = new Product("Эклер высший сорт", 30, 2);
        Product product4 = new Product("Макарон высший сорт", 100, 3);
        Product product5 = new Product("Крендель", 40, 1);
        Product product6 = new Product("Картошка", 100, 3);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        System.out.println("productList = " + productList);
        int maxPrice = 0;
        String maxNames = "";
        for (Product product : productList) {
            if (product.getName().contains("высший") && (product.getGrade() == 1 || product.getGrade() == 2)) {
                if (maxPrice < product.getPrice()) {
                    maxPrice = product.getPrice();
                }
            }
        }
        for (Product product : productList) {
            if (product.getName().contains("высший") && (product.getGrade() == 1 || product.getGrade() == 2)) {
                if (Objects.equals(product.getPrice(), maxPrice)) {
                    maxNames += product.getName() + "\n";
                }
            }
        }
        System.out.println("Большая цена товаров 1 или 2 сорта, в название которых есть «высший»");
        System.out.println("Товар с большей ценой: " + maxNames + maxPrice);
    }
}
