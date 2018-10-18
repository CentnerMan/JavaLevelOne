package ru.lebedev.se;

import java.util.Arrays;

/**
 * @author Анатолий Лебедев
 * @version 1.0.1
 */

public class App {
    public static void main(String[] args) {

        // 1. Проверяем инвертирование массива
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1};
        System.out.println(Arrays.toString(arr));
        invertArray(arr);
        System.out.println(Arrays.toString(arr));

        // 2. Проверяем работу по созданию и заполнению массива размером 8 с помощью цикла
        arr8();

        // 3.
        arr6to2();
    }
    // ---------------------------------------------------------------------------------------------------------

    // 1. Инвертируем массив
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i] - 1);
        }
    }
    // ---------------------------------------------------------------------------------------------------------

    // 2. Создаем и заполняем массив размером 8 с помощью цикла
    public static void arr8() {
        int[] arr = new int[8];
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b;
            b = b + 3;
        }
        System.out.println(Arrays.toString(arr)); // Проверяем работу
    }
    // ---------------------------------------------------------------------------------------------------------

    // 3. Цифры в массиве, меньшие 6 умножить на 2
    public static void arr6to2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr)); // Проверяем работу

    }

}
