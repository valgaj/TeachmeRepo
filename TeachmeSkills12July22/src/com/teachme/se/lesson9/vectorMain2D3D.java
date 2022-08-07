package com.teachme.se.lesson9;

import java.util.Arrays;

public class vectorMain2D3D {
    public static void main (String[] args) {
        double vx1 = 3.0d;
        double vy1 = 4.0d;
        double[] vectorA = {1d, 2d};
        double[] vectorB = {5d, 6d};

        /* Вектор задан двумя координатами vx1 и vy1 (вектор на плоскости). */
        System.out.println("# Creation & initialisation of vector object - vector. " +
                           "Invokes constructor with 2 parameters.");
        Vector2D vector = new Vector2D(vx1, vy1);

        /* Вызов метода расчета длины вектора */
        vector.vectorLength(vx1, vy1);
        System.out.println("# vector.vectorLength(vx1, vy1)=" + vector.vectorLength(vx1, vy1));

        /* Вызов метода расчета скалярного произведения */
        System.out.println();
        Vector2D vector1 = new Vector2D(vectorA, vectorB); /* В Vector2D есть соответ. когструктор */
        vector.scalarProduct (vectorA, vectorB); /* Вызов через vector - Vector2D vector = new Vector2D(vx1, vy1); */
        System.out.println("# vector.scalarProduct (vectorA, vectorB)=" + vector.scalarProduct (vectorA, vectorB));
        /* Вызов ScalarProduct через vector1 - Vector2D vector1 = new Vector2D(vectorA, vectorB) */
        vector1.scalarProduct (vectorA, vectorB);

        /* Вызов других методов векторной алгебры */
        System.out.println(System.lineSeparator() + "# Creation & initialisation of vector object  v");
        Vector2D v = new Vector2D (vectorA);

        System.out.println(System.lineSeparator() + "# Creation & initialisation of vector object  u1");
        Vector2D u1 = new Vector2D (vectorB);
        System.out.println("#  vectorB=" + Arrays.toString(vectorB));

        System.out.println(System.lineSeparator() + "# Creation & initialisation of vector object u2");

        System.out.println(System.lineSeparator() + "# Next operator invokes method .add(vector1, u)");
        Vector2D.add(v, u1); /* Вызов статического метода напрямую через класс Vector */

        /* 3D вектор Vector3D    вектор 3D Vector3D     вектор Vector3D     вектор Vector3D     вектор Vector3D */
        System.out.println(System.lineSeparator () + "# Vector3D # Vector3D # Vector3D");
        Vector3D[] vectors3D = Vector3D.generate(7);

        System.out.println(vectors3D[0]);
        System.out.println(vectors3D[1]);
        System.out.println("# 3D vectorLength  " + vectors3D[0].vectorLength(1.0, 3.0, 3.0));
        System.out.println("# 3D scalarProduct " + vectors3D[0].scalarProduct(vectors3D[1]));
        System.out.println("# 3D crossProduct " + vectors3D[0].crossProduct(vectors3D[1]));
        System.out.println("# 3D cos " +vectors3D[0].cos(vectors3D[1]));
        System.out.println("# 3D add " + vectors3D[0].add(vectors3D[1]));
        System.out.println("# 3D subtract " + vectors3D[0].subtract(vectors3D[1]));
    }
}
