package com.teachme.se.lesson9;

//public class Vector3D implements VectorsInterface{
public class Vector3D implements VectorsInterface {
    private final double x;
    private final double y;
    private final double z;

    /* Конструтор с тремя параметрами */
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /* Метод, вычисляющий длину вектора: корень из суммы квадратов координат */
    @Override
    public double vectorLength (double x, double y, double z) {
        return Math.sqrt(x * x + y * y + z * z);
    }
    @Override
    /* Метод, вычисляющий скалярное произведение */
    public double scalarProduct(Vector3D vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /* Метод, вычисляющий векторное произведение */
    public Vector crossProduct(Vector3D vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    /* Косинус между двумя векторами */
    public double cos(Vector3D vector) {
        /*  Для вычисления длины и произведения используются методы multiply и length */
        return scalarProduct(vector) / (vectorLength(vector.x, vector.y,vector.z) *
                                        vector.vectorLength(vector.x, vector.y,vector.z));
    }

        public Vector add(Vector3D vector) {
            return new Vector(
                    x + vector.x,
                    y + vector.y,
                    z + vector.z
            );
        }

        public Vector subtract(Vector3D vector) {
            return new Vector(
                    x - vector.x,
                    y - vector.y,
                    z - vector.z
            );
        }

    public static Vector3D[] generate(int n) {
        Vector3D[] vectors = new Vector3D[n];

        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector3D(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        String sep = ",\n ";

        int i = 0;
        String str = "[" + CONSTANTA3D + "\n" + " " +
                x +
                sep +
                y +
                sep +
                z;
        return str + "]";
    }
    @Override
    public double vectorLength(double vx1, double vy1) {
        return 0;
    }

    @Override
    public double scalarProduct(double[] vectorA, double[] vectorB) {
        return 0;
    }
}
