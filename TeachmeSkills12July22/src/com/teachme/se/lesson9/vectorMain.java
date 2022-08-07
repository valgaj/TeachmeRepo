package com.teachme.se.lesson9;

import java.util.Arrays;

public class vectorMain {
    public static void main (String[] args) {
        double[] entries1 = {1d, 2d, 3d, 4d};
        double[] entries2 = {5d, 6d, 7d, 8d};
        int n = 3; /* для статического метода generate(n), который принимает целое число N,
                     и возвращает массив случайных векторов размером N. */

        System.out.println("# Main class. Creation and initialisation of object vector1, class Vector");
        Vector vector1;
        vector1 = new Vector (entries1);
        System.out.println("# vector1.toString():" + " vector1=" + vector1);

        System.out.println();
        System.out.println("# Creation and initialisation of object u");
        Vector u = new Vector (entries2);

        System.out.println ();
        System.out.printf("# u.getEntries():" + Arrays.toString(u.getEntries()) + "\n");

        System.out.println(System.lineSeparator() + "# Creation and initialisation of object buf");
        Vector buf = new Vector (0.0d, 0.5d, 1.0d, 1.5d);

        System.out.println("# Creation and initialisation of object bufCopy for Copy constructor");
        Vector bufCopy = new Vector (buf); /* Создание и инициализация объекта. При этом, если нет следующего
        оператора вывода на печать bufCopy (или др. использования созданного объекта bufCopy), то в class Vector
        появляется желтое сообщение, что конструктор public Vector(Vector u) не используется. */
        System.out.println("# Result of Copy constructor." + bufCopy);

        System.out.println(System.lineSeparator() + "# Next operator invokes method .add(u)");
        /* к значениям u (текущий вектор) добавляются значения buf. То есть параметром для метода add(Vector u) в
           классе Vector будет указатель buf на объект [0.0d, 0.5d, 1.0d, 1.5d]. !При этом конструируется новый вектор
           по заданному в классе Vector конструктору, то есть в классе снова вызывается  метод Vector(double ... entries)
        */

        System.out.println ("# return from method buf.add(u):" + buf.add(u));

        System.out.println(System.lineSeparator() + "# Next operator invokes method .add(vector1, u)");
        Vector.add(vector1, u); /* Вызов статического метода напрямую через класс Vector */

        System.out.println(System.lineSeparator() + "# Next operator invokes method .vectorLength(u)");
        buf.vectorLength(u);
        System.out.println ("# return from method buf.vectorLength(u):" + buf.vectorLength(u));

        System.out.println(System.lineSeparator() + "# Next operator invokes method .difference(vector1, u)");
        Vector.difference(vector1, u); /* Вызов статического метода напрямую через класс Vector */
        System.out.println ("# return from method .difference(vector1, u):" + Vector.difference(vector1, u));

        System.out.println();
        System.out.println("# Next operator invokes method .subtract(vector1, u)");
        Vector.subtract(vector1, u); /* Вызов статического метода напрямую через класс Vector */
        System.out.println ("# return from method .subtract(vector1, u):" + Vector.subtract(vector1, u));

        System.out.println("# Next operator invokes method .buf.generate(n)");
        Vector.generate(n); /* Вызов статического метода напрямую через класс Vector */
        System.out.println ("# return from method .generate(n):" + Arrays.toString(Vector.generate(n)));
    }
}