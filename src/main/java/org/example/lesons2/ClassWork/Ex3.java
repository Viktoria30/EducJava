package org.example.lesons2.ClassWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("zadanie3(array, scanner) = " + zadanie3(array, scanner));
    }

    /**
     * @apiNote Дан массив целых чисел. Найти количество пар
     * соседних элементов, где первый элемент вдвое больше второго.
     * @param array входной массив
     * @param scanner
     * @return результат
     */
    private static int zadanie3(int[] array, Scanner scanner) {
        int k = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] * 2) {
                k++;
            }
        }
        return k;
    }
}
