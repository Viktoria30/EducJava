package org.example.lesons2.HomeWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("zadanie2(array, scanner) = " + zadanie2(array, scanner));
    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * @param array введенный вручную массив
     * @param scanner
     * @return возвращает результат верно или нет утверждение
     */
    private static boolean zadanie2(int[] array, Scanner scanner) {
        int len = array.length;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) return false;
            len++;
        }
        return true;
    }
}