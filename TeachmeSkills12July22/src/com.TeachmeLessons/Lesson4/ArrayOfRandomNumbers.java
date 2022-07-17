package com.TeachmeLessons.Lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfRandomNumbers {
    /* 2. Создайте и заполните массив случайным числами и выведете
     * максимальное, минимальное и среднее значение.
     * Для генерации случайного числа используйте метод Math.random().
     * Пусть будет возможность создавать массив произвольного размера.
     * Пусть размер массива вводится с консоли. */

    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<>();
        Scanner console, console1;
        String startStop = "start";
        int arrayLength;
        double max = 0.0;
        double min = 0.0;
        double average = 0.0;

        while (!startStop.equals("stop")) {
           System.out.println ("Enter array length - positive integer number");

           console1 = new Scanner(System.in);

                if (console1.hasNextInt()) {
                    arrayLength = console1.nextInt();

                    if (arrayLength > 0) {

                        for (int i = 0; i < arrayLength; i++) {
                            array.add(Math.random());

                            if (array.get(i) > max) {
                                max = array.get(i);
                            } else {
                                min = array.get(i);
                            }
                            average = average + array.get(i) / arrayLength;
                            //Компилятор не пропускает average+= Пишет Expression expected:36
                            System.out.println("array element-array.get(i)=" + array.get(i));
                        }
                        System.out.println(System.lineSeparator() + "array=" + array + "\n" + System.lineSeparator() + "max=" + max +
                                System.lineSeparator() + "min=" + min + System.lineSeparator() + "average=" + average);
                    } else {
                        System.out.println ("Entered number is not positive");
                        }
                } else {
                    System.out.println ("Entered number is not integer");
                    }

            System.out.println ("If you'd like to stop process enter " + "'stop'");

            console = new Scanner(System.in);
            startStop = console.nextLine();

            array.clear();
        }
    }
}


