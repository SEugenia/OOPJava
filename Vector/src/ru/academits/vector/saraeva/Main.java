package ru.academits.vector.saraeva;

/**
 * Created by Евгения on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        double[] arr = {1, 9};
        double[] arr2 = {1, 4, 0, 11, 6, 8};
        Vector vector3 = new Vector(arr);
        Vector vector = new Vector(arr2);
        //vector3.toString();
        System.out.print(vector.toString());
        System.out.println();
        vector.multiplyByScalar(3);
        System.out.println();
        System.out.println(vector3.getSize());


    }
}
