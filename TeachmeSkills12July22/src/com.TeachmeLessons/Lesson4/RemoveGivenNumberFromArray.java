package com.TeachmeLessons.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveGivenNumberFromArray {
    /* 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
     * Пусть число задается с консоли (класс Scanner). Если такого числа нет -
     * выведите сообщения об этом. В результате должен быть новый массив без указанного числа. */

    public static void main(String[] args) {
        int[] arrayInitial = {9, 5, -45, 23, 5, 9, 23};
        int[] arrayFinal; //Коммент. для себя: размерность объявлена в методе removeGivenNumberFromArray();
        int givenNumber;
        String startStop = "start";
        Scanner console = new Scanner(System.in);

        while (!startStop.equals("stop")) {
            givenNumber = setNumber();

            System.out.println("Main method. Entered number=" + givenNumber);

            arrayFinal = removeGivenNumberFromArray(arrayInitial, givenNumber);
            System.out.println("arrayFinal:" + Arrays.toString(arrayFinal));

            System.out.println("If you don't like to continue enter stop. startStop=" + startStop);
            startStop = console.nextLine();
        }
    }
    public static int setNumber() {
        int enteredNumber;

        System.out.println("Enter integer number");
        Scanner console = new Scanner(System.in);

        while (!console.hasNextInt()) {//Комментарий для себя console.hasNextInt() == false
            System.out.println("Entered number is not integer. Enter an integer number");
            console = new Scanner(System.in);
        }
        enteredNumber = console.nextInt();
        return enteredNumber;
    }

    public static int[] removeGivenNumberFromArray(int[] array, int givenNumber) {
        int i;
        int j = 0;
        int[] arrayFinal = new int[7];
        boolean flag = false;

        for (i = 0; i < array.length; i++) {
            if (givenNumber != array[i]) {
                arrayFinal[j] = array[i];
                j = j + 1;
            } else {
                    flag = true;
                }
        }

        if (i==array.length && !flag) {
            System.out.println("No such number in the array.");
        }
        return (arrayFinal);
    }
}



















