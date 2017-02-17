package ru.evg.zakamen23.range;

import java.util.Arrays;

/**
 * Created by Евгения on 05.02.2017.
 */
public class UseRange2 {
    public static void main(String[] args) {
        Range range1 = new Range(5, 9);
        Range range2 = new Range(1, 5);
        System.out.println("пересечение " + range1.intersect(range2));
        Range[] array = range1.union(range2);
        System.out.println("объединение " + Arrays.toString(array));
        Range[] array2 = range1.difference(range2);
        System.out.println("разность " + Arrays.toString(array2));
    }
}