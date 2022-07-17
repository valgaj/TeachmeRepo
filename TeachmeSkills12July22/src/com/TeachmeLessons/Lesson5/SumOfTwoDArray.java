package com.TeachmeLessons.Lesson5;

public class SumOfTwoDArray {
    /* 4. Создайте двумерный массив целых чисел. Выведите на консоль сумму
    всех элементов массива.*/

    public static void main (String[] args){
        int [][] array = {{1,3,5,9},{6,2,4,2},{0,2,4,7}};

        long sumTwoDArray=sumOfTwoDArray(array);
        System.out.println("sumOfTwoDArray=" + sumTwoDArray);
    }
    public static long sumOfTwoDArray (int[][] array){
        long sumTwoDArray=0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                sumTwoDArray = sumTwoDArray + anInt;
            }
        }
        return sumTwoDArray;
    }
}
