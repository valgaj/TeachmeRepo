package com.TeachmeLessons.Lesson4;

import java.util.Arrays;

public class ChangeElemOfArrayWithOddIndexForNull {
    /* 5. Создайте массив и заполните массив.
     * Выведите массив на экран в строку.
     * Замените каждый элемент с нечётным индексом на ноль.
     * Снова выведете массив на экран на отдельной строке. */

    public static void main(String[] args){
        double [] array = new double [10];

        for (int i=0; i<array.length; i++){
            array[i] = (int) (Math.random() * 6);
        }
        System.out.println("array=" + Arrays.toString(array) +System.lineSeparator());

        for (int i = 0; i < array.length; i++){
            if (i%2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println("array changed=" + Arrays.toString(array));
    }
}
