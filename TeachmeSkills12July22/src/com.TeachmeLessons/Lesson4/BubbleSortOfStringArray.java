package com.TeachmeLessons.Lesson4;

import java.util.Arrays;

public class BubbleSortOfStringArray {
    /* 7.Реализуйте алгоритм сортировки пузырьком. */

    public static void main(String[] args) {
        String[] array = {"Ivan", "Andrey", "Mario", "Ivan", "Damir", "Marko", "Darko"};
        int resultOfcomparision;
        String temp;
        boolean flag = false; //notSorted
        int i;
        int cicleNumber = 0;

        while (!flag) {
            flag = true;

            for (i = 0; i < array.length - 1; i++) {
                resultOfcomparision = array[i].compareTo(array[i+1]);
                if (resultOfcomparision > 0) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                    flag = false;
                    System.out.println("i=" + i  + " temp=" + temp + " " + Arrays.toString(array));
                }
            }
            cicleNumber++;
            System.out.println("flag= " + flag + " cicleNumber=" + cicleNumber);
            System.out.println(System.lineSeparator()  + "Sorted Array=" + Arrays.toString(array));
        }
    }
}



