package com.teachme.se.lesson7.employees;

public class Accountant implements JobTitlePrintable {
    public String jobTitle;

    /* Если класс реализует интерфейс, то для данного класса устанавливаются следующие обязательства:
        1) класс обязательно должен содержать реализацию методов, объявленных в этом интерфейсе;
        2) сигнатура методов интерфейса должна совпадать с сигнатурой этих же методов, реализованных в классе;
        3) методы, которые реализуют элементы интерфейса, обязательно должны быть объявлены в классе как public;
        4) в классе запрещено изменять значения переменных, объявленных в интерфейсе.
     */
    public Accountant(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void ShowJobTitle() {
        System.out.println (jobTitle);
    }
}
