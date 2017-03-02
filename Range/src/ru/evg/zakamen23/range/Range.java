package ru.evg.zakamen23.range;

/**
 * Created by Евгения on 05.02.2017.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from > to) {
            throw new IllegalArgumentException("Конец отрезка меньше начала");
        }
        this.from = from;
        this.to = to;
    }

    public void setFrom(double from) {
        if (from > to) {
            throw new IllegalArgumentException("Конец отрезка меньше начала");
        }
        this.from = from;
    }

    public void setTo(double to) {
        if (from > to) {
            throw new IllegalArgumentException("Конец отрезка меньше начала");
        }
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

    public boolean hasNoIntersection(Range range) {
        return (to <= range.from || range.to <= from);
    }

    public Range intersect(Range range) {
        if (hasNoIntersection(range)) {
            return null;
        } else {
            return new Range(Math.max(from, range.from), Math.min(to, range.to));
        }
    }

    public Range[] union(Range range) {
        if (to <= range.from) {
            return new Range[]{new Range(from, to), new Range(range.from, range.to)};
        } else if (from >= range.to) {
            return new Range[]{new Range(range.from, range.to), new Range(from, to)};
        } else {
            return new Range[]{new Range(Math.min(from, range.from), Math.max(to, range.to))};
        }
    }

    public Range[] difference(Range range) {
        if (hasNoIntersection(range)) {
            return new Range[]{new Range(from, to)};
        } else if (range.from <= from && to >= range.to) {
            return new Range[]{new Range(range.to, to)};
        } else if (range.from <= from && range.to >= to) {
            return new Range[0];
        } else if (to >= range.from && range.to >= to) {
            return new Range[]{new Range(from, range.from)};
        } else {
            return new Range[]{new Range(from, range.from), new Range(range.to, to)};
        }
    }

    public String toString() {
        return "[" + from + " ; " + to + "]";
    }
}











