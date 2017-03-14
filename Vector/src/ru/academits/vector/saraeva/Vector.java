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
        System.arraycopy(vectorArray, 0, this.vector, 0, vectorArray.length);
    }

    public Vector(int dimension, double[] vectorArray) {     //конструктор d
        this.vector = new double[dimension];

        System.arraycopy(vectorArray, 0, this.vector, 0, Math.min(vector.length, vectorArray.length));
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (double aVector : vector) {
            builder.append(aVector);
            builder.append(' ');
        }
        builder.deleteCharAt(builder.length() - 1);
        return "{" + builder + "}";
    }

   /* public void totUpVectors(Vector vector2) {
        int resultDimension = Math.max(vector.length, vector2.getSize());
        double[] vectorResult = new double[resultDimension];
        for (int i = 0; i < Math.max(vector.length, vector2.getSize()); ++i) {
            vectorResult[i] = vector[i] + vector2();
        }
    }*/

    public void multiplyByScalar(double scalar) {
        double[] resVector = new double[vector.length];
        for (int i = 0; i < vector.length; ++i) {
            resVector[i] = scalar * vector[i];
        }
    }

    public int getSize() {
        return vector.length;
    }


}
