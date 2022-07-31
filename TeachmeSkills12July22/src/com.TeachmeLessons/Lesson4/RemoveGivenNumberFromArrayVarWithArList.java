package com.TeachmeLessons.Lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveGivenNumberFromArrayVarWithArList {

        /* 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
         * Пусть число задается с консоли (класс Scanner). Если такого числа нет -
         * выведите сообщения об этом. В результате должен быть новый массив без указанного числа. */

    public static void main(String[] args) {
        int[] arrayInitial = {9, 5, -45, 23, 5, 9, 23};
        ArrayList<Integer> arrayFinal;
        int givenNumber;
        String startStop = "start";
        Scanner console = new Scanner(System.in);

            while (!startStop.equals("stop")) {
                givenNumber = setNumber();

                System.out.println("Main method. Entered number=" + givenNumber);

                arrayFinal = removeGivenNumberFromArray(arrayInitial, givenNumber);
                System.out.println("arrayFinal:" + arrayFinal);

                System.out.println("If you don't like to continue enter stop. startStop=" + startStop);
                startStop = console.nextLine();
            }
    }
    public static int setNumber() {
        int enteredNumber;

        System.out.println("Enter integer number");
        Scanner console = new Scanner(System.in);

            while (!console.hasNextInt()) {
                System.out.println("Entered number is not integer. Enter an integer number");
                console = new Scanner(System.in);
            }
            enteredNumber = console.nextInt();
            return enteredNumber;
    }

    public static ArrayList <Integer> removeGivenNumberFromArray(int[] array, int givenNumber) {
        int i;
        int j = 0;
        ArrayList <Integer> arrayFinal = new ArrayList<>();
        boolean flag=false;

            for (i = 0; i < array.length; i++) {
                if (givenNumber != array[i]) {
                    arrayFinal.add(array[i]);
                    j = j + 1;
                } else {
                    flag = true;
                }
            }

            if (i == array.length && !flag) {
                System.out.println("No such number in the array.");
            }
            return (arrayFinal);
    }
}




