package com.TeachmeLessons.Lesson4;

import java.util.Scanner;

public class IfGivenNumberBelongsToArray {
    /* 0. Создайте массив целых чисел. Напишете программу, которая выводит
     * сообщение о том, входит ли заданное число в массив или нет.
     * Пусть число для поиска задается с консоли (класс Scanner).*/

    public static void main (String[] args) {

        int[] array = new int[] {12, 20, -56, 4, 9, -76, 9};
        String startStop = "start";
        Scanner console1;

        while (!startStop.equals("stop")){
                           //Comment for myself (!startStop.equals("stop")) = startStop.equals("stop")==false

            int numberEnteredByUser = setValue();

            ifNumberBelongsToArray(array, numberEnteredByUser);

            System.out.println("If you don't like to continue, please, enter stop. " + "startStop=" + startStop);

            console1 = new Scanner(System.in);
            startStop = console1.nextLine();
            System.out.println("startStop=" + startStop);
        }

    }
    public static int setValue(){
        int numberEntered;

        System.out.println("Method running. Please, enter a number");
        Scanner console = new Scanner(System.in);

            while (!console.hasNextInt()) {
                System.out.println("Entered number is not integer");
                System.out.println("Entered integer number");
                console = new Scanner(System.in);
            }
            numberEntered = console.nextInt();
            System.out.println("Entered number is integer");

        return numberEntered;
    }

    public static void ifNumberBelongsToArray(int[] array, int numberEnteredByUser) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == numberEnteredByUser) {
                System.out.println("Entered number belongs to the array");
                break;
            } else {
                if (i == array.length - 1) {
                    System.out.println("Entered number doesn't belong to the array");
                }
            }
        }
    }
}