package com.TeachmeLessons.Lesson4;

import java.util.Arrays;

public class SortingOfStringArray {
        /* 6. Создайте массив строк. Заполните его произвольными именами людей.
         * Отсортируйте массив.
         * Результат выведите на консоль. */

    public static void main(String[] args) {
        String[] array = {"Ivan", "Andrey", "Mario", "Ivan", "Damir", "Marko", "Darko"};
        int resultOfcomparision;
        boolean isSorted = false;
        String temp;

            while (!isSorted) {

                for (int i = 1; i < array.length; i++) {
                    isSorted = true;

                    for (int j = i-1; j >= 0; j--) {
                        resultOfcomparision = array[i].compareTo(array[j]);

                        if (resultOfcomparision <= 0) {
                            isSorted = false;

                            temp = array[i];

                            for (int k = i; k > j; k--) {
                                array[k] = array[k - 1];
                            }
                            array[j] = temp;
                            System.out.println("i=" + i + " j=" + j + " " + "temp=" + temp + Arrays.toString(array));
                        } else {
                            break;
                          }
                    }
                    System.out.println(System.lineSeparator() + "Sorted Array=" + Arrays.toString(array));
                }
            }
    }
}

