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
        builder.append('{');
        for (double aVector : vector) {
            builder.append(aVector);
            builder.append(',');
            builder.append(' ');
        }
        builder.delete(builder.length() - 2, builder.length());
        builder.append('}');
        return builder.toString();
    }


    public void addUpVectors(Vector vector2) {
        if (vector.length < vector2.getSize()) {
            double[] newVector = vector;
            int oldLength = vector.length;
            vector = new double[vector2.getSize()];

            for (int i = 0; i < oldLength; ++i) {
                vector[i] = newVector[i];
            }
        }
        for (int i = 0; i < vector2.vector.length; ++i) {

            vector[i] = vector[i] + vector2.vector[i];
        }
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < vector.length; ++i) {
            vector[i] = scalar * vector[i];
        }
    }

    public void vectorMinusVector(Vector vector2) {
        if (vector.length < vector2.getSize()) {
            double[] newVector = vector;
            int oldLength = vector.length;
            vector = new double[vector2.getSize()];

            for (int i = 0; i < oldLength; ++i) {
                vector[i] = newVector[i];
            }
        }
        for (int i = 0; i < vector2.vector.length; ++i) {

            vector[i] = vector[i] - vector2.vector[i];
        }
    }

    public void rotateVector() {
        multiplyByScalar(-1);
    }

    public int getSize() {
        return vector.length;
    }

    public double getElement(int index) {
        if (index < 0 || index >= vector.length) {
            throw new ArrayIndexOutOfBoundsException("Введите значение индекса в пределах от нуля по размерность вектора-1 включительно");
        }
        return vector[index];
    }
}
