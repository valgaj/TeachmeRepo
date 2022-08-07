package com.teachme.se.lesson9;

import java.util.Arrays;

/*
 * The Vector class provides basic vector operations for Euclidean vectors
 * represented as arrays of real numbers.
 *
 * All operations between two vectors are designed for vectors of the same
 * length, and no checking is done. For loops are controlled by the length
 * of the first vector, so if the second vector is longer, an Exception may
 * not be thrown as expected.
 * Thanks to danhales.
*/

public class Vector {
/*
 * entries contains the entries in the vector
*/
    private final double[] entries;

    /*
     * threshold for double comparisons
    */
    /* public static final double THRESHOLD = Double.MIN_VALUE * 1000; */
    public static final String CONSTANTA = "This vector is for n-coordinate system.";

    /*
     * Constructor makes a copy of the array passed.
     * @param entries an array containing the entries in the vector
    */
    public Vector(double...entries) {
        /* Поскольку используется передача аргумента через Varargs, то нужно определить размер массива.
           Иначе - "this.entries" for double array is null.
        */
        this.entries = new double[entries.length]; /* this.entries points to new array entries */

        System.out.printf ("Varargs. entries.length=%s  this=%s" +
                           " Pointer to new array entries-this.entries=%s\n", entries.length, this,
                            Arrays.toString(this.entries));

            for (int i = 0; i < entries.length; i++) {
                this.entries[i] = entries[i];

                System.out.println ("Varargs. this.entries[i]=" + this.entries[i]);
        }
    }

    public double[] getEntries() {
         return entries;
    }

    /*
     * copy constructor copies the entries in vector into v
     * @param u a Vector object
    */
    /* В классе _Main_ оператор { Vector u = new Vector(аргумент - массив) } создал и проинициализировал объект класса
     * Vector - u. В классе _Vector_ вызывается конструктор с аргументами типа Varargs. Создаваемый объект содержит поле
     * (массив) entries. В него передались значения аргумента (массива в дан. случае) из Vector(массив).
     * Созданный объект также содержит поле (массив) entries - см. конструктор с Varargs.
    */
     public Vector(Vector u) {
         this.entries = new double[u.entries.length];

             for (int i = 0; i < u.entries.length; i++) {
                 this.entries[i] = u.entries[i]; /* this.entries и u.entries (обращаются к) указывают на два разных
                                                    поля(массива в данном сл.) entries, которые есть у двух разных
                                                    объектов одного класса Vector - this and и; */


                 System.out.printf ("Copy constructor. this.entries[i]=" + this.entries[i] + "u" + u);
                }
         System.out.println();
        }

    /*
     * add method accepts a vector and adds it to the current vector
     * @param u the vector to add onto the calling vector.
     * @return a Vector object whose entries are the element-wise sums
     * of the calling vector and the argument
    */
    public Vector add(Vector u) {
    System.out.println("Method .add(Vector u). u.toString():" + u.toString()+"\n" +
                        "Invokes method add(Vector u1, Vector u2) where Vector u1 points to current vector"
                        + " - this; and u2. points to u");

    return Vector.add(this, u); /* this-текущий вектор, "u" - вектор, который прибавляется к текущему.
                                   Вызов метода add(Vector u1, Vector u2). */
    }

    /*
     * add method accepts two vectors and returns their element-wise
     * sum in a new Vector object. Assumes v1 and v2 have the same
     * length.
     * @param u1 a Vector object
     * @param u2 a Vector object
     * @return a Vector objects whose entries are the sums of corresponding entries in u1 and u2
    */
    public static Vector add(Vector u1, Vector u2) {
        Vector.checkLengths(u1, u2);

        double[] sums = new double[u1.length()];

            for (int i = 0; i < sums.length; i++) {
                sums[i] = u1.get(i) + u2.get(i);
            }
            System.out.println ("Method add(Vector u1, Vector u2)" + " Result-double[] sums=" +
                                 Arrays.toString(sums) +"\n");

        return new Vector(sums); /* создается и инициализируется новый объект класса Vector - new Vector(sums), что
                                    вызывает конструктор public Vector(double...entries). В него передается аргумент
                                    double[] sums.
                                    Реализация метода .get(i) - ниже в коде. */
   }

    /* Доп.
     * Difference method accepts two vectors and returns their element-wise
     * difference in a new Vector object. Assumes v1 and v2 have the same
     * length.
     * @param u1 a Vector object
     * @param u2 a Vector object
     * @return a Vector objects whose entries are the difference of corresponding entries in u1 and u2
     */
    public static Vector difference(Vector u1, Vector u2) {
        Vector.checkLengths(u1, u2);

        double[] difference = new double[u1.length()];

        for (int i = 0; i < difference.length; i++) {
            difference[i] = u1.get(i) - u2.get(i);
        }

        return new Vector(difference); /* создается и инициализируется новый объект класса Vector.
                                          new Vector(difference) вызывает конструктор public Vector(double...entries).
                                          В него передается аргумент double[] difference */
    }

    /*
     * subtract method returns the difference of two vectors. note
     * that difference is a special case of sum (v1 + (-1)*v2)
     * @param v1 a Vector object
     * @param v2 a Vector object
     * @return a new Vector object whose entries are the differences of
     *         the entries in v1 and v2 (v1 - v2)
    */
    public static Vector subtract(Vector v1, Vector v2) {
        return Vector.add(v1, v2.multiply(-1)); /* v1-v2=v1+(-v2), поэтому можно сократить код, вызвав метод
                                                         add(Vector u1, Vector u2) */
    }

    public double vectorLength (Vector u) {
        double sum = 0;

        for (int i = 0; i < u.entries.length; i++) {
            sum = sum + u.get(i);
        }
        System.out.printf ("Method vectorLength. sum=%.2f"  +  " Math.sqrt(sum)=%.2f\n", sum, Math.sqrt(sum));

        return  Math.sqrt(sum);
    }

    /*
     * checkLengths method accepts two vectors and throws and
     * IllegalArgumentException if they are not the same lengths.
     * @param u1 a Vector object
     * @param u2 a Vector object
    */
    /*
     The throw keyword is used to create a custom error.
     The throw statement is used together with an exception type. There are many exception types available in Java:
     ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.
     The exception type is often used together with a custom method.
    */
    public static void checkLengths(Vector u1, Vector u2) {
        if (u1.length() != u2.length()) {
            throw new IllegalArgumentException("Vectors are different lengths");
        }
    }

    /* Статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N. */
    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];

        for(int i = 0; i < n; i++){
            /* Для вектора, заданного тремя координатами */
            /*  vectors[i] = new Vector( Math.random(), Math.random(),Math.random()); */

            vectors[i] = new Vector (Math.random());
        }
        return vectors;
    }

    /*
     * Returns the entry in the specified position.
     * @param position the position to return
     * @return the value in entries[position]
    */
    public double get(int position) {
        return Vector.get(this, position);
    }

    /*
     * Returns the entry in the specified position.
     * @param u a Vector object
     * @param  the position to return
     * @return the value in u[position]
    */
    public static double get(Vector u, int position) {
        return u.entries[position];
    }

    /*
     * multiply method accepts a scalar to and multiplies each element of
     * entries by that value.
     * @param scalar the real number to multiply the entries by
     * @return a Vector object whose entries are the element-wise sums
     *    of the calling vector and the argument
    */
    public Vector multiply(double scalar) {
        return Vector.multiply(this, scalar);
    }

    /*
     * multiply accepts a Vector object and a scalar and returns
     * a Vector whose entries are the entries of the Vector, multiplied
     * by the scalar.
     * @param u a Vector object
     * @param scalar a real number
     * @return the scalar product of the vector and the scalar
    */
    public static Vector multiply(Vector u, double scalar) {
        double[] products = new double[u.length()];

        for (int i = 0; i < products.length; i++) {
            products[i] = scalar * u.get(i);
        }

        return new Vector(products);
    }

    /*
     * length method returns the number of entries in the
     * vector.
     * @return the length of v
    */
    public int length() {
        return Vector.length(this);
    }

    /*
     * length method returns the number of entries in the
     * vector.
     * @param u a Vector object
     * @return the length of u
    */
    public static int length(Vector u) {
        return u.entries.length;
    }


    /*
     * Return a String containing the vector represented as a row in brackets, e.g.
     * [1.0, 2.2, 3.1, 4.9, 5.7]
     * @return a String representation of the vector
    */
    @Override
    /* The toString() method returns a string representing the object. */
    public String toString() {
        StringBuilder str = new StringBuilder("{" + "["); //var 1. String str = CONSTANTA +"[";
        String sep = ", ";

            for (int i = 0; i < this.entries.length; i++) {
                str.append(this.entries[i]);

                    if (i < (this.entries.length - 1)) { // if we're not at the last entry
                        str.append(sep);
                    }
           }
        return str + "]" + " " + CONSTANTA + "}";
    }
}
