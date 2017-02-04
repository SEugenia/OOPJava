package ru.evg.zakamen.evg.zakamen22;

/**
 * Created by Евгения on 01.02.2017.
 */
public class UseRange {
    public static void main(String[] args) {
        Range interval1 = new Range(7, 12);
        Range interval2 = new Range(7, 12);

        System.out.println("Длина интервала = " + interval1.getLength1());
        System.out.println(interval1.isInside1(11));

        //interval.setFrom(9);
        //interval.setTo(18);

        System.out.println("Длина интервала = " + interval2.getLength2());
        System.out.println(interval2.isInside2(8));


    }
}
