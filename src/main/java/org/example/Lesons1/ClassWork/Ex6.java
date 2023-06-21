package org.example.Lesons1.ClassWork;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] resArr = numberSum(array);
        for (int elem: resArr) {
            System.out.print(elem + " ");
        }
    }

    /**
     * @apiNote Задан массив nums. Мы определяем текущую сумму
     * массива как runningSum[i] = sum(nums[0]...nums[i]).
     * Возвращает текущую сумму чисел.
     * @param array введенный массив
     * @return результат массив чисел
     */
    private static int[] numberSum(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }
        return result;
    }
}
