package com.TeachmeLessons.Lesson5;

public class TwoDArraysMultiplication {
    /*
     3. Умножение двух матриц
     * Создайте два массива целых чисел размером 3х3 (две матрицы).
     * Напишите программу для умножения двух матриц.
     * Первый массив: {{1,0,0},{0,1,0},{0,0,0}}
     * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
     * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
    */

    public static void main(String[] args) {
        int[][] array1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}};

        twoDArrayMultiplication(array1, array2);
    }
    public static void twoDArrayMultiplication (int[][] array1, int[][] array2) {
        int index;
        int[][] arrayMultiplied = new int[3][3];

        for (int i=0; i<array1.length; i++){
            index=i;
            for (int j=0; j<array1[i].length; j++) {
                arrayMultiplied[i][j] = array1[i][index] * array2[i][j];
                System.out.print(arrayMultiplied[i][j] + " ");
            }
            System.out.print("  ");
        }
    }
}

