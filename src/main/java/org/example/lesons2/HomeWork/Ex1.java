package org.example.lesons2.HomeWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("zadanie1(n, scanner) = " + zadanie1(n, scanner));
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param n кол-во чисел в строке
     * @param scanner вводим N числа с клавиатуры
     * @return вывод суммы простых чисел
     */
    private static int zadanie1(int n, Scanner scanner) {
        int sum = 0;
        int count = 0;
        int counter = 0;
        //int n1 = scanner.nextInt();
        for (int i = 2; i <= n+1; i++) {
            int n2 = scanner.nextInt();
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum = sum + i;
                counter++;
            }
        }
        return sum;
    }
}
