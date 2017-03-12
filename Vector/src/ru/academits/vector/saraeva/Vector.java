package ru.academits.vector.saraeva;

/**
 * Created by Евгения on 10.03.2017.
 */
public class Vector {
    private double[] vector;

    public Vector(int dimension) {                // конструктор а
        this.vector = new double[dimension];
    }

    public Vector(Vector vectorObject) {          // конструктор b
        this(vectorObject.vector);
    }

    public Vector(double[] vectorArray) {
        this.vector = new double[vectorArray.length];
        for (int i = 0; i < vectorArray.length; ++i) {
            this.vector[i] = vectorArray[i];
        }
    }

    public Vector(int dimension, double[] vectorArray) {     //конструктор d
        this.vector = new double[dimension];

        for (int i = 0; i < Math.min(vector.length, vectorArray.length); ++i) {
            this.vector[i] = vectorArray[i];
        }

        if (dimension < vectorArray.length) {
            for (int i = vector.length; i < vectorArray.length; ++i) {
                this.vector[i] = 0;
            }
        }
    }

   /* public Vector totUpVectors(Vector vector2) {

        for (int i = 0; i < Math.min(this.vector.length, ); ++i) {
            this.vector[i] = vectorArray[i];
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
