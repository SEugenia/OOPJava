package ru.evg.zakamen.evg.zakamen22;

/**
 * Created by Евгения on 01.02.2017.
 */
public class Range {
    private double from1;
    private double to1;
    private double from2;
    private double to2;

    public Range(double from, double to) {
        this.from1 = from1;
        this.to1 = to1;
        this.from2 = from2;
        this.to2 = to2;
    }

    public void setFrom1(double from1) {
        this.from1 = from1;
    }

    public void setFrom2(double from2) {
        this.from2 = from2;
    }

    public void setTo1(double to1) {
        this.to1 = to1;
    }

    public void setTo2(double to1) {
        this.to1 = to1;
    }

    public boolean isInside1(double number) {
        return number >= from1 && number <= to1;
    }

    public boolean isInside2(double number) {
        return number >= from2 && number <= to2;
    }

    public double getLength1() {
        return to1 - from1;
    }

    public double getLength2() {
        return to2 - from2;
    }
}
