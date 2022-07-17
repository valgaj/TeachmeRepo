package com.TeachmeLessons.Lesson5;

import java.util.Arrays;

public class ArraySquareDiagonals {
    /* 5. Создайте двумерный массив. Выведите на консоль диагонали массива.*/

    public static void main(String[] args){
    int[][] array={{1,2,3,4},{3,2,1,4},{5,6,7,8},{0,7,5,3}};

        printTwoDArray (array);

        arrayDiagonals (array);
    }

    public static void printTwoDArray (int [][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.print(System.lineSeparator());
        }
    }

    public static void arrayDiagonals(int[][] array) {
        int j;
        int[] diagonalUpperLeft = new int[array.length];
        int[] diagonalBottomLeft = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            j = i;
            diagonalUpperLeft[i] = array[i][j];
            diagonalBottomLeft[i] = array[(array.length - 1)-i][j];
        }
        System.out.print(System.lineSeparator() + "diagonalUpperLeft=" + Arrays.toString(diagonalUpperLeft));
        System.out.print(System.lineSeparator() + "diagonalBottomLeft=" + Arrays.toString(diagonalBottomLeft));
    }
}
        /* Комментарий оставила только для себя
         * for (int i = array.length - 1; i >= 0; i--) {
         * j = (array.length - 1) - i;
         * diagonalBottomLeft[(array.length - 1)-i] = array[i][j];
         * System.out.print(" " + array[i][j]);
         * }
         */