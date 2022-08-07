package com.teachme.se.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsMethods {
    public static void main(String[] args) {
        String strInitial = "xxxx-yyy-xxxx-yyy-xyxy";
        String strTest = "555 abc xxxx-yyy-xxxx-yyy-xyxy-1a2b";
        String subString = "abc";
        int iStart = 0; /* Start of first block */
        int jSize = 8;
        String regex = "xxxx"; /* Regular expression. Регулярное выражение */

        stringLength(strInitial);
        patternMatcher (strInitial, regex);
        System.out.println(stringNew (strInitial));
        subString(strInitial,iStart,jSize);
        System.out.println();
        stringContains(strInitial, strTest, subString);
        System.out.println();
        stringReplace(strInitial);
        startsEndsWith(strInitial, strTest);
    }

    public static void stringLength(String strInitial){
        System.out.println("strInitial.length()=" + strInitial.length());
    }
    public static void patternMatcher (String strInitial, String regex) {
    /* Creating a pattern object. Создание объекта шаблона */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(strInitial);
        System.out.println(matcher.find());
    }

    public static void subString (String strInitial, int iStart, int jSize) {
    /* Вывести на экран в одну строку два первых блока по 4 цифры. */

        /* For testing. Start of second block */
        int kStart = 4;
        int lSize = 8;
        /*                                   */

        System.out.println("subString. " + strInitial.substring(iStart,jSize));
        System.out.println("subString. " + strInitial.substring(iStart,jSize) + strInitial.substring(kStart,lSize));
    }

    public static void stringContains (String strInitial, String strTest, String subString) {
    /* Проверить содержит ли номер документа последовательность abc и вывести
       сообщение содержит или нет (причем, abc и ABC считается одинаковой последовательностью).
       Примечание: метод .contains() чувствителен к регистру. Если бы попытались искать "ABC" в наших string,
       то результат будет false.
       Для проверки без учета регистра используем
       String toUpperCase()/toLowerCase() — преобразование всех символов вызывающей строки в верхний/нижний регистр.
    */
        System.out.println(strInitial.toLowerCase().contains(subString.toLowerCase()));
        /* OR */
        System.out.println(strInitial.toUpperCase().contains(subString.toUpperCase()));

        System.out.println(strTest.toLowerCase().contains(subString.toLowerCase()));
        /* OR */
        System.out.println(strTest.toUpperCase().contains(subString.toUpperCase()));

        /* The same logic */
        if (strInitial.toLowerCase().contains(subString.toLowerCase())){
           System.out.println ("strInitial contains abc");
       } else {
           System.out.println ("strInitial doesn't contain abc");
       }
    }

    public static void stringReplace(String strInitial) {
    /* Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *). */
    System.out.println("strdoc1[" + strInitial.replace('y','*')+"]");
    }
    public static void startsEndsWith(String strInitial, String strTest) {
    /* Проверить начинается ли номер документа с последовательности 555.
       Проверить заканчивается ли номер документа на последовательность 1a2b.
    */
        System.out.println (System.lineSeparator() + "startsWith.");
        System.out.println ("strInitial " + strInitial.startsWith("555"));
        /* strTest */
        System.out.println ("strTest " + strTest.startsWith("555"));
        /* OR */
        if (strInitial.startsWith("555")) {
            System.out.println("strInitial. if-else: true");
        } else {
            System.out.println("strInitial. if-else: false");
        }

        System.out.println (System.lineSeparator() + "endsWith.");
        System.out.println ("endsWith. strInitial " + strInitial.endsWith("1a2b"));
        /* strTest */
        System.out.println ("endsWith. strTest " + strTest.endsWith("1a2b"));
    }

    public static String stringNew (String strInitial) {
    /*    Вывести на экран только одни буквы из номера документа в формате
        yyy/yyy/y/y в нижнем регистре.
    */
        int[] blockSize = {3,1};
        int j=0;
        int counter=0;
        int sizeLimit = 7;

        StringBuilder str = new StringBuilder("[");
        String sep = "/";

        for (int i = 0; i < strInitial.length(); i++) {
            if (strInitial.charAt(i) == 'y') {
                str.append('y');
                j++;
                counter++;

                if (j == blockSize[0] || counter == sizeLimit) {
                    str.append(sep);
                    j = 0;
                }
            }
        }
        String strfinal = str + "]";
        System.out.println("strfinal" + strfinal);
        return strfinal.toLowerCase();  /* переводит все символы строки в нижний регистр */
    }
}
