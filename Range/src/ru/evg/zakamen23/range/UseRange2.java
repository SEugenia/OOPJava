package ru.evg.zakamen23.range;

/**
 * Created by Евгения on 05.02.2017.
 */
public class UseRange2 {
    public static void main(String[] args) {
        Range range1 = new Range(24, 26);
        Range range2 = new Range(23, 28);
        Range[] Arrays = {range1, range2};
        System.out.println(range1.intersect(range2));
        //for (int i = 0; i < array.length; ++i) {
            //System.out.println(Arrays.toString(array));
        }
    }