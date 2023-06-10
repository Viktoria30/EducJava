package org.example.Lesons1.HomeWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("swap(s) = " + swap(s));
        scanner.close();
    }

    /**
     * @apiNote Учитывая входную строку s, измените порядок слов в обратном порядке.
     * @param s введенная строка
     * @return результат
     */
    private static String swap(String s) {
        String[] words = s.trim().split(" ");
        String out = "";
        for (int i = words.length-1; i > 0; i--) {
            out += words[i] + " ";
        }
        return out + words[0];
    }
}
