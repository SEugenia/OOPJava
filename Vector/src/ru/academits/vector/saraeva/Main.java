package ru.academits.vector.saraeva;

import java.util.Arrays;

/**
 * Created by Евгения on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        double[] arr = {1, 9, 2, 2, 6, 1};
        double[] arr2 = {1, 9, 2, 2.0001};
        double[] arr3 = {1, 9, 2, 2.0002};
        Vector vector = new Vector(arr);
        Vector vector2 = new Vector(arr2);
        Vector vector3 = new Vector(arr3);
        /*System.out.println(vector.hashCode());
        System.out.println(vector3.hashCode());
        System.out.println(vector.equals(vector3));*/
        /*System.out.println(vector3.toString());
        System.out.print(vector.toString());
        System.out.println();
        vector3.multiplyByScalar(3);
        System.out.println(vector3);
        vector3.rotateVector();
        System.out.println(vector3);
        System.out.println();
        System.out.println(vector3.getSize());*/
        //vector3.addUpVectors(vector);
        //vector.vectorMinusVector(vector);
        /*System.out.println(vector3.toString());
        System.out.println(vector.toString());
        vector3.multiplyByScalar(3);
        System.out.println(vector3.toString());
        vector3.rotateVector();*/
        //  System.out.println(vector.getElement(6));
        //System.out.println(vector.toString());
        //vector.rotateVector();
        //System.out.println(vector.toString());
        //vector.setNewElement(3, 7);
        //System.out.println(vector.toString());
        //System.out.println(vector3.equals(vector));
    }

    public static double[] addUpVectors(Vector vector2, Vector vector3, double[] arr2, double[] arr3) {
        int resDimension = Math.max(arr2.length, arr3.length);
        double[] sumArray = new double[resDimension];

        for (int i = 0; i < resDimension; ++i) {

            sumArray[i] = arr2[i] + arr3[i];
        }
        return sumArray;
    }
}

