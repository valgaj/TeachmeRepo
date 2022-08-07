package com.teachme.se.lesson8.phone.service;

import java.util.Arrays;

public class PhoneService {
    String [] numbersVarargs;
    String number, model, callerName;
    float weight;

    public PhoneService() {
    }

    /* Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
       которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
     */

    public void sendMessage(String... numbersVarargs) {
        System.out.print("Varargs numbers:");
        for (String var: numbersVarargs) {//Разные способы вывести Varargs на печать
            System.out.printf("%s ", var);
        }
        System.out.print("Varargs:" + Arrays.toString(numbersVarargs)+"\n");
    }
}
