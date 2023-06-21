package org.example.lesons2.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("zadanie2(n, scanner) = " + zadanie2(n, scanner));
    }

    /**
     * @apiNote Дана последовательность из N целых чисел.
     * Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     * @param n длинна последовательности
     * @param scanner вспомогательный класс
     * @return сумма чисел, которые заканчиваются на 5
     */
    private static int zadanie2(int n, Scanner scanner) {
        int sum = 0;
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int n2 = scanner.nextInt();
            if (n2 % 10 == 5 && n1 % 2 == 0) {
                sum += n2;
            }
            n1 = n2;
        }
        return sum;
    }
}

