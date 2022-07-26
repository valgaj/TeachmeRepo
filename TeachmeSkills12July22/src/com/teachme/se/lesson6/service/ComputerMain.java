package com.teachme.se.lesson6.service;

import com.teachme.se.lesson6.entity.Computer;
import com.teachme.se.lesson6.entity.HDD;
import com.teachme.se.lesson6.entity.RAM;

public class ComputerMain {
    /* При создании объекта "компьютер" с помощью первого конструктора должны создаваться
     * поля RAM и HDD с помощью конструкторов по умолчанию.
     *  В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
            *  Тестовый сценарий для проверки:
            *  создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
     * создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.  */

    public static void main (String[] args) {
        //comp1
        float price = 1700.5f;
        String model = "Dell";

        System.out.println ("comp1");

        Computer comp1 = new Computer (price, model);
        System.out.println(comp1);

        //comp2
        price = 1000.74f;
        model = "HP";
        String ramManufacturer = "Kingston";
        int ramCapacity = 32;

        String hddTitle = "Verbatim";
        int hddCapacity = 2; //2TB
        String hddType = "internal";

        RAM ram2 = new RAM(ramManufacturer, ramCapacity);
        HDD hdd2 = new HDD(hddTitle, hddCapacity, hddType);

        System.out.println ("comp2");
        Computer comp2 = new Computer (price, model, ram2, hdd2);
        System.out.println(comp2);
    }
}
