package ru.evg.zakamen.evg.zakamen22;

public class UseRange2 {
    public static void main(String[] args) {
        Range2 interval1 = new Range2(30,23, 18, 16);

        System.out.println(interval1.getIntersection());
        System.out.println(interval1.getUnion());
        System.out.println(interval1.getDifference());

    }
}
