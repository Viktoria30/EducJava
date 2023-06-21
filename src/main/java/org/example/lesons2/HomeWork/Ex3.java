package org.example.lesons2.HomeWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = {2, 67, 78, -7, 89, -8, 9};

        int[] resArr = zadanie3(array);
        for (int elem: resArr) {
            System.out.print(elem + " ");
        }
    }

//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
    private static int[] zadanie3(int[] array) {
        int len = array.length;
        int sumindex = 0;
        int[] array2 = new int[len];
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] % 10 == 0 || array[i] % 10 == 1) {
                sumindex += i;
            }
        for (int j = 0; j < array.length-1; j++) {
            if (array[i] < 0) {
                array[i] = i;
            }
        }
        array2 = array;
        }
        return array2;
    }
}
