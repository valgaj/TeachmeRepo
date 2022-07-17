package com.TeachmeLessons.Lesson5;

import java.util.Scanner;

import static java.lang.System.lineSeparator;

public class ThreeDArrayIncreaseOfEachElement {
   /* 1. Создать трехмерный массив из целых чисел.
    * С помощью циклов "пройти" по всему массиву и увеличить каждый
    * элемент на заданное число. Пусть число, на которое будет
    * увеличиваться каждый элемент, задается из консоли. */

    public static void main (String[] args) {
        //int [][][] array = new int[2][3][4] ;
        int[][][] arrayThreeD = {{{2, 4, 5, 1}, {7, 6, 5, 8}, {21, 4, 1, 11}}, {{71, 6, 51, 8}, {2, 2, 52, 12},
                {7, 6, 52, 7}}};
        int givenNumber;

        System.out.println("Enter integer number");
        Scanner console = new Scanner(System.in);
        givenNumber = console.nextInt();

        threeDArrayIncreaseElem(arrayThreeD, givenNumber);
    }
    public static void threeDArrayIncreaseElem( int[][][] arrayThreeD, int givenNumber) {
        for (int i = 0; i < arrayThreeD.length; i++) {
            for (int j = 0; j < arrayThreeD[i].length; j++) {
                System.out.print("i=" + i + " ");
                for (int k = 0; k < arrayThreeD[i][j].length; k++) {

                    System.out.print("arrayIncrsd=" + (arrayThreeD[i][j][k]+givenNumber) + "  ");
                }
                System.out.print(lineSeparator());
            }
            System.out.print(lineSeparator());
        }
    }
}
