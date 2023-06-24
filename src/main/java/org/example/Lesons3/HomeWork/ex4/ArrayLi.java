package org.example.Lesons3.HomeWork.ex4;

import java.util.Random;

public class ArrayLi {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 5));
            System.out.println(array[i]);
        }

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное: " + max);

        int min = 0;
        for (int n : array) {
            if (n < min)
                min = n;
        }
        System.out.println("Минимальное: " + min);

        double average = 0;
        for (int n : array) {
            average += n;
        }
        System.out.println("Среднее арифметическое: " + average / array.length);

        /**Задан целочисленный список ArrayList. Найти минимальное,
         * максимальное и среднее из этого списка.
         */
    }
}
