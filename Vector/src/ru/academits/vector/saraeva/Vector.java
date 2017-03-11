package ru.academits.vector.saraeva;

/**
 * Created by Евгения on 10.03.2017.
 */
public class Vector {
    private double[] vector;

    public Vector(int dimension) {                // конструктор а
        double[] vector = new double[dimension];
    }

    public Vector(Vector vector) {          // конструктор b
        double[] arr = new double[]{};
        Vector vector2 = new Vector(arr);
        vector2=vector;
    }

    public Vector(double[] vector) {
        double[] newVector = new double[vector.length]; // конструктор с
        for (int i = 0; i < vector.length; ++i) {
            vector[i] = newVector[i];
        }
    }

    public Vector(int dimension, double[] vector) {     //конструктор d
        double[] newVector = new double[vector.length];
        if (vector.length <= newVector.length) {
            for (int i = 0; i < vector.length; ++i) {
                vector[i] = newVector[i];
            }
        }
        if (vector.length > newVector.length) {
            for (int i = 0; i < newVector.length; ++i) {
                vector[i] = newVector[i];
            }
            for (int i = newVector.length; i < vector.length; ++i) {
                vector[i] = 0;
            }
        }
    }


   /* public Vector(double[] vector, double[] ) {
//TODO copyVector
        }

    public Vector( double[] filling){
            // TODO filling
        }

    public Vector( int n, double[] filling){
            // TODO filling
        }

    public int getSize() {
        return dimension;
    }

    public String toString() {
//for(int i=0; i<vector.length;++i){

    }

}*/
}
