package org.example.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("positivmetod(n, scanner) = " + positivmetod(n, scanner));
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует
     * отрицательное число.
     * @param n введенная последовательность чисел
     * @param scanner
     * @return результат
     */
    private static int positivmetod(int n, Scanner scanner) {
        int count = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) count++;
            a = b;

        }
        scanner.close();
        return count;
    }
}
