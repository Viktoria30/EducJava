package org.example.Lesons3.HomeWork.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", 1000, 1990, 1300);
        Book book2 = new Book("Край неба", "Васильев", 400, 2010, 311);
        Book book3 = new Book("Зеленая миля", "Кинг", 350, 2014, 347);
        Book book4 = new Book("Гарри Поттер", "Роулинг", 1050, 2019, 544);
        Book book5 = new Book("Унесенные ветром", "Митчелл", 500, 2020, 1088);
        Book book6 = new Book("Шерлок Холмс", "Конан-Дойл", 800, 2019, 881);
        Book book7 = new Book("Прислуга", "Стоккет", 700, 2011, 576);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        StringBuilder sortedBooks = new StringBuilder();
        for (Book books : bookList) {
            if (isPrime(books.getPage()) && books.getSurname().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }

    /**
     * @param num подаем значение (page) кол-во страниц
     * @return вывод простое ли число
     */
        private static boolean isPrime (Integer num){
            if (num == 1) {
                return true;
            }
            if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
                return false;
            }
            for (int i = 2; i < num * num; i++) {
                if (i != num) {
                    if (num % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }
}
