package com.TeachmeLessons.Lesson5;

public class ThreeDArraySortAscending {
    /*
     * 6. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
     */

    public static void main (String[] args){
        int[][] arrayInt ={{1,2,5,4},{8,7,5,7},{7,5,3,0},{2,1,4,3}};

        threeDArraySortAscending(arrayInt);
    }

    public static void threeDArraySortAscending(int[][] arrayInt){
        int temp;
        Boolean isSorted = false;

        while (!isSorted){

            for (int i = 0; i < arrayInt.length; i++) {
                isSorted = true;

                for (int j = 1; j < arrayInt[i].length; j++) {
                    temp = arrayInt[i][j];

                    int k=j;
                    while (k>0 && temp < arrayInt[i][k - 1]) {

                        arrayInt[i][k] = arrayInt[i][k -1];
                        k--;
                        isSorted = false;
                    }
                    arrayInt[i][k] = temp;

                }
                for (int j = 0; j < arrayInt[i].length; j++) {
                    System.out.print(arrayInt[i][j]);
                }
                System.out.print(System.lineSeparator());
            }
            System.out.print(System.lineSeparator());
        }
    }
}
