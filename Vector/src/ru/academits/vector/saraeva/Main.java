package ru.academits.vector.saraeva;

/**
 * Created by Евгения on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        double[] arr = {1, 9, 2, 2};
        double[] arr2 = {1, 4, 0, 11, 6, 1};
        Vector vector3 = new Vector(arr);
        Vector vector = new Vector(arr2);
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
        vector.setNewElement(-1, 7);
        System.out.println(vector.toString());
    }
}
