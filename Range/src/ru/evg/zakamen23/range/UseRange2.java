package ru.evg.zakamen23.range;

import java.util.Arrays;

/**
 * Created by Евгения on 05.02.2017.
 */
public class UseRange2 {
    public static void main(String[] args) {
        Range range1 = new Range(5, 23);
        Range range2 = new Range(0, 14);
        Range[] array = new Range[1];
        System.out.println("пересечение " + range1.intersect(range2));
        range1.union(range2);
        for (Range currentElement: array){
            }
       /* for (int i = 0; i < array.length; ++i) {
            System.out.println(Arrays.toString(array));
        }*/
        range1.difference(range2);
        for (int i = 0; i < array.length; ++i) {
            System.out.println(Arrays.toString(array));
        }
    }
}