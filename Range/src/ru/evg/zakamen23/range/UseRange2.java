package ru.evg.zakamen23.range;

import java.util.Arrays;

/**
 * Created by Евгения on 05.02.2017.
 */
public class UseRange2 {
    public static void main(String[] args) {
        Range range1 = new Range(6, 12);
        Range range2 = new Range(3, 6);
        Range[] array = new Range[array.length];
        System.out.println("пересечение " + range1.intersect(range2));
        range1.union(range2);
        System.out.println(Arrays.toString(array));
        range1.difference(range2);
        System.out.println(Arrays.toString(array));
    }
}