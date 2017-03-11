package ru.academits.vector.saraeva;

/**
 * Created by Евгения on 10.03.2017.
 */
public class Vector {
    private double[] vector;


    public Vector(double[] vector) {
        //double[] newVector = new double[vector.length];
        for (int i = 0; i < vector.length; ++i) {
            this.vector[i] = vector[i];
        }
    }

   /* public Vector() {
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
