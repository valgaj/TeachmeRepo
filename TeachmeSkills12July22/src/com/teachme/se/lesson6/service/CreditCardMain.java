package com.teachme.se.lesson6.service;

import com.teachme.se.lesson6.entity.CreditCard;

public class CreditCardMain {
    /* Основное задание
     * 1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
     * Добавьте метод, который позволяет начислять сумму на кредитную карточку.
     * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
     * Добавьте метод, который выводит текущую информацию о карточке.
     *      Напишите программу, которая создает три объекта класса CreditCard у
     *  которых заданы номер счета и начальная сумма.
     * Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
     * Выведите на экран текущее состояние всех трех карточек.
     */

    public static void main (String[] args) {
        int accountIvan = 1270050;
        float balanceIvan = 1000f;
        float addedAmountIvan = 10.5f;
        float withdrawAmountIvan = 25.5f;

        CreditCard cardIvan = new CreditCard(accountIvan,balanceIvan,addedAmountIvan,withdrawAmountIvan);

        System.out.print("Credit card Ivan" + System.lineSeparator());
        System.out.println(cardIvan);

        balanceIvan = cardIvan.addedAmount (accountIvan, balanceIvan, addedAmountIvan);
        System.out.println("balanceIvan_Added=" + balanceIvan);

        balanceIvan = cardIvan.withdrawAmount (accountIvan, balanceIvan, withdrawAmountIvan);
        System.out.println("balanceIvan_W=" + balanceIvan);

        String creditCardIvan = toStringPassedArgs (accountIvan, balanceIvan);
        System.out.println(creditCardIvan);

        int accountPavel = 2577777;
        float balancePavel = 2000f;
        float addedAmountPavel = 100.7f;
        float withdrawAmountPavel = 15.3f;

        System.out.println (System.lineSeparator() + "Credit card Pavel");

        CreditCard cardPavel = new CreditCard(accountPavel,balancePavel,addedAmountPavel,withdrawAmountPavel);
        System.out.println(cardPavel);

        balancePavel = cardPavel.withdrawAmount (accountPavel, balancePavel, withdrawAmountPavel);
        System.out.println("balancePavel_W =" + balancePavel);

        balancePavel = cardPavel.addedAmount (accountPavel, balancePavel, addedAmountPavel);
        System.out.println("balancePavel_Added =" + balancePavel);

        String creditCardPavel = toStringPassedArgs (accountPavel, balancePavel);
        System.out.println(creditCardPavel);

        int accountNic = 345678;
        float balanceNic = 5000f;
        float addedAmountNic = 100.4f;
        float withdrawAmountNic = 200.5f;

        System.out.println (System.lineSeparator() + "Credit card Nic");

        CreditCard cardNic = new CreditCard(accountNic,balanceNic,addedAmountNic,withdrawAmountNic);

        System.out.println(cardNic);

        balanceNic = cardIvan.withdrawAmount (accountNic, balanceNic, withdrawAmountNic);
        System.out.println("balanceNic_W =" + balanceNic);

        String creditCardNic = toStringPassedArgs (accountNic, balanceNic);
        System.out.println(creditCardNic);
    }

    public static String toStringPassedArgs (int account,float balance) {

        return "CreditCard{" +
                "account=" + account +
                ", balance=" + balance +
               // ", addedAmount=" + addedAmount +
               // ", withdrawAmount=" + withdrawAmount +
                '}';
    }
}
