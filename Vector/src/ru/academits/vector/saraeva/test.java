package ru.academits.vector.saraeva;

/**
 * Created by Евгения on 11.03.2017.
 */
public class test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9};
        int[] arr2 = new int[]{0, 0};
        if (arr2.length <= arr.length) {
            for (int i = 0; i < arr2.length; ++i) {
                arr2[i] = arr[i];
            }
        }
        if (arr2.length > arr.length) {
            for (int i = 0; i < arr.length; ++i) {
                arr2[i] = arr[i];
            }
            for (int i = arr.length; i < arr2.length; ++i) {
                arr2[i] = 0;
            }
        }
        for (int i = 0; i < arr2.length; ++i) {
            System.out.print(arr2[i] + " ");
        }
    }
}
