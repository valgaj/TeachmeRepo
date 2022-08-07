package com.teachme.se.lesson7.docsAccountingSystem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class docsMain {
    public static void main (String[] args) {
        /* В этом методе напишите код для создания каждого из типов документов,
           добавления их в регистр и вывода информации о документе;
           - Все классы разместить по пакетам;
           - При выполнении задания использовать понятия интерфейсов и абстрактных классов.
        */

        String employeeName = "Ivan";
        double monthlyTotal = 2000.50;
        String departmentCode = "111";
        /* Конструктор Date(int year, int month, int day).
        Объект Date с пустым конструктором. Результат - текущая дата и время на момент создания объекта.
         */
        Date contractEndDate = new Date();
        String typeOfGoods ="Toys";
        int quantityOfGoods = 33;
        int docNumber = 10;
        /* Календарный месяц нужен May. Для верно отражения указала с-1, иначе выводится June.
           Месяцы в Calendar считаются с 0 (январь).
           Числа, начинающиеся с 0 трактуются, как восьмеричные (При указании "2022,05,24" выводилось
           docDate-Sat Jun 24 00:00:00 MSK 3922)
        */
        LocalDate docDate =  LocalDate.of (2022, 5, 24);

        /* Создание экземпляров классов ContractWithEmployee и ConsignmentNote, которые наследуются от класса Register.
           Переменная register позволяет получить доступ к переменным и методам класса Register.
        */
        Document[] document = {new ContractWithEmployee(), new ConsignmentNote(), new ContractForSupplyGoods()};

        System.out.println("Classes with Empty Constructors.\nregister:" + Arrays.toString(document));
        System.out.println();

        /* Создание экземпляров классов ContractWithEmployee и ConsignmentNote, которые наследуются от класса Register.
           register (массив в данном сл.) позволяет получить доступ к переменным и методам класса Register.
           Register register1 = new ContractWithEmployee(contractEndDate, employeeName);
        */

        Document[] documentFull = {new ContractWithEmployee(docNumber, docDate, contractEndDate, employeeName),
                                   new ConsignmentNote(docNumber, docDate, monthlyTotal, departmentCode),
                                   new ContractForSupplyGoods(docNumber, docDate,typeOfGoods, quantityOfGoods)};

        /* Получение информации о документах. Добавление в Регистр (подсчет числа документов). Реализация интерфейса */
        Register register = new Register();

        for (Document value : document) {
            value.provideInfoAboutDoc();
            /* Реализация интерфейса */
            value.analyze();

            register.addDocumentToRegister(value);
        }

             System.out.println(System.lineSeparator() + "Constructor with 2 parameters");
             for(int i = 0; i < documentFull.length; i++) {
                 documentFull[i].provideInfoAboutDoc();
                 documentFull[i].analyze();

                 register.addDocumentToRegister(document[i]);
            }
    }
}