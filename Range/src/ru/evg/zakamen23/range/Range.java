package ru.evg.zakamen23.range;

/**
 * Created by Евгения on 05.02.2017.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean intersectionCheck(Range range) {
        return (to <= range.from || range.to <= from);
    }

    public Range intersect(Range range) {
        boolean result = intersectionCheck(range);
        if (result) {
            return null;
        } else {
            return new Range(Math.max(from, range.from), Math.min(to, range.to));
        }
    }

    public Range[] union(Range range) {
        if (to <= range.from) {
            Range[] array = {new Range(from, to), new Range(range.from, range.to)};
            return array;
        } else if (from >= range.to) {
            Range[] array = {new Range(range.from, range.to), new Range(from, to)};
            return array;
        } else {
            Range[] array = {new Range(Math.min(from, range.from), Math.max(to, range.to))};
            return array;
        }
    }

    public Range[] difference(Range range) {
        boolean result = intersectionCheck(range);
        // if (to < range.from || from > range.to || to == range.from) {
        if (result) {
            Range[] array = {new Range(from, to)};
            return array;
        } /*else if (from > range.to) {
            Range[] array = {new Range(from, to)};
            return array;
        }*/ else if (range.from < from && to > range.to) {
            Range[] array = {new Range(range.to, to)};
            return array;
        } else if (range.from < from && range.to > to) {
            Range[] array = {};
            return array;
        } else if (to > range.from && range.to > to) {
            Range[] array = {new Range(from, range.from)};
            return array;
        } else {//(range.from < to && range.to < to) {
            Range[] array = {new Range(from, range.from), new Range(range.to, to)};
            return array;
        }
    }

    public String toString() {
        return "[" + from + " ; " + to + "]";
    }
}









 /* public Range intersect2(Range range) {

        if (to < range.from) {
            return null;
        } else if (from > range.to) {
            return null;
        } else if (range.from < from && to > range.to) {
            return new Range(from, range.to);
        } else if (range.from < from && range.to > to) {
            return new Range(from, to);
        } else if (to > range.from && range.to > to) {
            return new Range(range.from, to);
        } else { //(range.from < to && range.to < to) {
            return new Range(range.from, range.to);
        }
    }*/

    /* public Range[] union(Range range) {
        if (to < range.from) {
            Range result1 = new Range(from, to);
            Range result2 = new Range(range.from, range.to);
            Range[] array = {result1,result2};
             return array;
        } else if (from > range.to) {
            Range result1 = new Range(range.from, range.to);
            Range result2 = new Range(from, to);
            Range[] array = {result1,result2};
                        return array;
        } else if (range.from < from && to > range.to) {
            Range result = new Range(range.from, to);
            Range[] array = {result};
            return array;
        } else if (range.from < from && range.to > to) {
            Range result = new Range(range.from, range.to);
            Range[] array = {result};
            return array;
        } else if (to > range.from && range.to > to) {
            Range result = new Range(from, range.to);
            Range[] array = {result};
            return array;
        } else {//(range.from < to && range.to < to) {
            Range result = new Range(from, to);
            Range[] array = {result};
            return array;
        }
    }*/