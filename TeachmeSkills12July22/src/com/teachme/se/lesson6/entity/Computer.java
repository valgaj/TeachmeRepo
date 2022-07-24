package com.teachme.se.lesson6.entity;

public class Computer {
    /* 1. Создать класс для описания компьютера, в этом классе должны быть поля:
     * стоимость, модель(строковый тип), RAM и HDD.
     *   Для полей RAM и HDD следует создать свои собственные классы.
     * Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
     * Класс RAM имеет поля "название" и "объем".
     * Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
     * Класс Computer должен иметь два конструктора:
     *       - первый - с параметрами стоимость и модель,
     *      - второй - со всеми полями.
     *  При создании объекта "компьютер" с помощью первого конструктора должны создаваться
     * поля RAM и HDD с помощью конструкторов по умолчанию.
     *  В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
     *  Тестовый сценарий для проверки:
     *  создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
     * создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.  */

    float price;
    String model;

    RAM ram;
    HDD hdd;
    public Computer(float price, String model) {
        this.price = price;
        this.model = model;

        RAM ram1 = new RAM(); //Правильно ли сделан этот блок?
        HDD hdd1 = new HDD();
        this.ram = ram1;
        this.hdd = hdd1;

        System.out.println(ram1);
        System.out.println(hdd1);
    }

    public Computer(float price, String model, RAM ram2, HDD hdd2) {
        this.price = price;
        this.model = model;

        this.ram = ram2;
        this.hdd = hdd2;

        System.out.println(ram);
        System.out.println(hdd);
    }

    public String toString() {

        return "Computer{" +
                "price=" + price +
                ", model=" + model +
                ", RAM=" + ram +
                ", HDD=" + hdd +
                '}';
    }
}
