package com.teachme.se.lesson7.employees;

public class jobTitleMain {
    public static void main(String[] args) {

    /* Класс Интерфейс. Сначала объявляется ссылка на интерфейс JobTitlePrintable, затем для этой ссылки
       создается объект. Объявляется экземпляр класса (объект), например, Accountant.
       Класс Accountant реализует интерфейс JobTitlePrintable.
       JobTitlePrintable [] jobTitlePrintables = {new Accountant(jobTitle),new Director (jobTitle), new Worker()};
     */
        String[] jobTitles = {"accountant","director","other"}; // "worker" установлен в _конструкторе_ класса Worker.

        for (String title: jobTitles) { /* for (int i = 0 ; i < jobTitles.length; i++) */
            if (title.equals("accountant")) {
                JobTitlePrintable accountant = new Accountant(title);
                accountant.ShowJobTitle();
            } else {
                if (title.equals("director")) {
                    JobTitlePrintable director = new Director (title);
                    director.ShowJobTitle();
                }
                else {
                    JobTitlePrintable worker = new Worker();
                    worker.ShowJobTitle();
                }
            }
        }
    }
}
