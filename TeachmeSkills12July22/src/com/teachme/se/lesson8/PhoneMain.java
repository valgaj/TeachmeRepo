package com.teachme.se.lesson8;

import com.teachme.se.lesson8.phone.entity.Phone;
import com.teachme.se.lesson8.phone.service.PhoneService;

public class PhoneMain {
    public static void main(String[]args){
        String[] model = new String[] {"Apple", "Samsung", "Sputnik", "Nokia","Fly"};
        float[] weight = {50f, 100f, 200f, 300f, 400f};
        String[] number = {"111","222","333", "444", "555"};
        String[] callerName = new String[] {"Ivan", "Martin", "Nic", "Peter", "Zvonimir"};

        int arraysLength = model.length;
        String returnedNumber;

        /* 1. Создание объектов класса Phone. Конструктор Phone без параметров.
              Создание  PhoneService для вызова метода sendMessage() с Varargs.
         */
        Phone[] phones = {new Phone(), new Phone(), new Phone(), new Phone(), new Phone()};
        PhoneService[] phoneServices = {new PhoneService(), new PhoneService(), new PhoneService(),
                                        new PhoneService(), new PhoneService()};

        System.out.println("Block 1");

            for (int i=0; i<arraysLength; i++) {
                phones[i].setModel(model[i]);
                phones[i].setWeight(weight[i]);
                phones[i].setNumber(number[i]);

                phones[i].showVar(); /* Вывод на консоль значений переменных */
                phones[i].receiveCall(callerName[i]);
                System.out.println();
                phones[i].receiveCall (callerName[i], number[i]);

                returnedNumber = phones[i].getNumber(callerName[i]);
                System.out.println("returnedNumber=" + returnedNumber);

                phoneServices[i].sendMessage("55","66","77","99");
            }
        System.out.println(System.lineSeparator() + "Block 2");/* Пропускаем строку между блоками вызова методов */

        /* 2. Создание объектов класса Phone. Вар1. Конструктор Phone с тремя параметрами. */
        Phone[] phonesWithArgs = {new Phone(model[0], weight[0], number[0]), new Phone(model[1], weight[1],  number[1]),
                new Phone(model[2], weight[2], number[2]), new Phone(model[0], weight[0], number[0]),
                new Phone(model[0], weight[0], number[0])};

                for (Phone phone : phonesWithArgs) {
                    phone.showVar();
                }

                for (int i=0; i<arraysLength; i++) {
                    phonesWithArgs[i].receiveCall(callerName[i]);
                    System.out.print(" ");

                    System.out.println();

                    phonesWithArgs[i].receiveCall (callerName[i], number[i]);

                    returnedNumber=phonesWithArgs[i].getNumber(callerName[i]);
                    System.out.println("returnedNumber=" + returnedNumber);

                }
        /* 3. Создание объектов класса Phone. Вариант2. Конструктор Phone с параметрами.
              Альтернативный вариант объявления массива.
         */
        Phone[] phonesWithArgsA = new Phone[5];

        System.out.println("Block 3");//Отличие от System.out.println(System.lineSeparator() + "Block 2");

                /* Инициализация массива и использование методов класса Phone */
                for (int i=0; i<arraysLength; i++) {
                    phonesWithArgsA[i] = new Phone(model[i], weight[i], number[i]);

                    phonesWithArgsA[i].showVar();
                    phonesWithArgsA[i].receiveCall(callerName[i]);

                    System.out.println();

                    phonesWithArgsA[i].receiveCall (callerName[i], number[i]);

                    returnedNumber=phonesWithArgsA[i].getNumber(callerName[i]);
                    System.out.println("returnedNumber=" + returnedNumber);
                }
    }
}
