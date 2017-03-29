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
        //vector3.setNewElement(2,17);
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
}

