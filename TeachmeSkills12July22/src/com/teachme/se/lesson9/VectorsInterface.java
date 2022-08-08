package com.teachme.se.lesson9;

public interface VectorsInterface {
    String CONSTANTA2D = "This vector is for 2 dimensional coordinate system";
    String CONSTANTA3D = "This vector is for 3 dimensional coordinate system";

    /* examples of methods in Interface. Not all sets of methods presented in classes Vector2D and Vector3D */
    double vectorLength (double vx1, double vy1);
    double vectorLength (double vx1, double vy1, double vz1);

    double scalarProduct (double[] vectorA, double[] vectorB);
    double scalarProduct(Vector3D vector);
}
