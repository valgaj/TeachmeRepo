package com.teachme.se.lesson7.employees;

public class Director implements JobTitlePrintable{
    public String jobTitle;

    //конструкторы
    public Director(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    //методы, которые реализуют элементы интерфейса, обязательно должны быть объявлены в классе как public;
    @Override
     public void ShowJobTitle() {
        System.out.println(jobTitle);
    }
}
