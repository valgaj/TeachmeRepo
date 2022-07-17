package com.TeachmeLessons.Lesson5;

import java.util.Arrays;

public class SortingOfStringArrayCorr {
    /* 6. Создайте массив строк. Заполните его произвольными именами людей.
     * Отсортируйте массив.
     * Результат выведите на консоль. */

    public static void main(String[] args) {
        String[] array = {"Ivan", "Andrey", "Mario", "Ivan", "Damir", "Marko", "Darko"};
        boolean isSorted = false;
        String temp;
        int j;

        while (!isSorted) {

            for (int i = 1; i < array.length; i++) {
                isSorted = true;

                temp = array[i];
                j=i;
                    while (j >0 && (array[i].compareTo(array[j - 1])<=0)){
                            array [j] = array [j-1];
                            j--;

                            isSorted = false;
                    }
                    array[j] = temp;
                    System.out.println("i=" + i + " j=" + j + " " + "temp=" + temp + Arrays.toString(array));
            }

        }
                System.out.println(System.lineSeparator() + "Sorted Array=" + Arrays.toString(array));
    }
}


