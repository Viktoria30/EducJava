package org.example.HomeWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("positivmetod(n, scanner) = " + positivmetod(n, scanner));
        scanner.close();
    }

    /**
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем.
     * Найти сумму положительных чисел, после которых следует отрицательное число.
     * @param n введенная последовательность чисел
     * @param scanner
     * @return результат
     */
    private static int positivmetod(int n, Scanner scanner) {
        int sum = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        while(a != 0) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) sum += a;
            a = b;

        }
        scanner.close();
        return sum;
    }
}
