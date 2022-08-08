package com.teachme.se.lesson9;

import java.util.Arrays;
public class Vector2D implements VectorsInterface {
    private final double[] entries;
    double[] vectorA;

    public Vector2D(double...u) {
    this.entries = new double [u.length];

    System.out.printf ("""
                            Constructor(Varargs). u.length=%s
                            this=%s  Pointer to new array entries - this.entries=%s
                        """,
                             u.length, this, Arrays.toString(this.entries));

        for (int i = 0; i < entries.length; i++) {
            this.entries[i] =u[i];

            System.out.printf ("Constructor(Varargs). this.entries[i]=%s" + "  this.entries=%s\n",
                                this.entries[i], Arrays.toString(this.entries));
        }
    }

    public Vector2D (double[] entries, double[] vectorA) {
        this.vectorA = vectorA;
        this.entries = entries;
    }

    /* Сложение двух веторов класса Vector */
    public static void add (Vector2D v1, Vector2D v2) {
        double [] vectorsSum = new double[v1.entries.length];

        System.out.println ("Method add(2 vector objects)");

        for (int i=0; i<v1.entries.length; i++) {
            System.out.printf ("  v1.entries[i]=%.2f" + "  v2.entries[i]=%.2f"
                                + "  v1.entries=%s" + " v2.entries=%s", v1.entries[i], v2.entries[i],
                                Arrays.toString(v1.entries), Arrays.toString(v2.entries) +"\n");

            vectorsSum[i] = v1.entries[i] + v2.entries[i];
        }
        System.out.println (System.lineSeparator() + "Result is double[] sums=" + Arrays.toString(vectorsSum) + "\n");

        new Vector2D(vectorsSum);
    }

    @Override
    public double vectorLength (double vx1, double vy1) {
        System.out.printf ("vectorLength. vx1=%.2f"  + " vy1=%.2f" + " vx1+vy1=%.2f" +
                           "  Math.sqrt(vx1 + vy1)=%.2f\n",  vx1, vy1, (vx1 + vy1), Math.sqrt(vx1 + vy1));

        return  Math.sqrt(vx1 + vy1);
    }

    /* В прямоугольной системе координат скалярное произведение векторов vA(x1,y1) и vB(x2, y2)
       выражается формулой vA*vB=vAx1*vBx2 +vAy1*vBy2.
    */

    @Override
    public double scalarProduct (double[] vectorA, double[] vectorB) {
        double scalarProduct = 0;

        System.out.println ("Method ScalarProduct.");

        for (int i=0; i<vectorA.length; i++) {
            scalarProduct = scalarProduct + (vectorA[i] * vectorB[i]);

            System.out.printf ("  vectorA[i]=%s  vectorB[i]=%s" + "  scalarProduct=%s",
                                 vectorA[i], vectorB[i], scalarProduct +"\n");
        }

        System.out.println ("ScalarProduct." + "scalarProduct=" + scalarProduct);

        return  scalarProduct;
    }

    /*
     toString() method. By default, this method returns a String representation of the object’s address in memory,
     but by overriding it, we can customize the way our objects are displayed––for example, when passed to an output
     statement.
    */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        String sep = ",\n ";

        for (int i = 0; i < this.entries.length; i++) {
            str.append(this.entries[i]);

            if (i < (this.entries.length - 1)) {
                str.append(sep);
            }
        }
        return str + "]" + CONSTANTA2D;
    }

    @Override
    public double vectorLength(double vx1, double vy1, double vz1) {
        return 0;
    }

    @Override
    public double scalarProduct(Vector3D vector) {
        return 0;
    }
}
