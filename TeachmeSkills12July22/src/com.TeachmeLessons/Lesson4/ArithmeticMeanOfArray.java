package com.TeachmeLessons.Lesson4;

import java.util.Arrays;

public class ArithmeticMeanOfArray {
    /* 3. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
     *    Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов
     *     это значение оказалось больше (либо сообщите, что их средние арифметические равны).*/

    public static void main (String[] args){
        int[] array1 = {4,8,3,5,2};
        int[] array2 = {7,10,4,9,1};

        System.out.println("Array1 " + Arrays.toString(array1) + System.lineSeparator() + "Array2 " + Arrays.toString(array2));

        float arithMean1 = arithmeticMeanOfArray (array1);
        System.out.println("Main method. ArithmeticMeanOfArray1=" + arithMean1);

        float arithMean2 = arithmeticMeanOfArray (array2);
        System.out.println("Main method. ArithmeticMeanOfArray2=" + arithMean2);

        if (arithMean1 == arithMean2) {
            System.out.println(System.lineSeparator() + "arithMean1==arithMean2");
        } else {
            if (arithMean1 < arithMean2) {
                System.out.println(System.lineSeparator() + "arithMean1<arithMean2");
            } else {
                System.out.println(System.lineSeparator() + "arithMean1>arithMean2");
            }
        }
    }
        public static float arithmeticMeanOfArray (int[] array){
            int sum = 0;
            float arithmeticMeanOfArray;

            for (int j : array) {
                sum = sum + j;
            }
            /*  Commit не пропускал, когда была такая запись. Предложеил заменить на enhance for
                for (int i = 0; i<array.length; i++) {
               * sum = sum + array[i];
            }*/

            arithmeticMeanOfArray = (float) sum/array.length;

            System.out.println(System.lineSeparator() + "method arithmeticMeanOfArray = " + arithmeticMeanOfArray);
            return arithmeticMeanOfArray;
        }
}
