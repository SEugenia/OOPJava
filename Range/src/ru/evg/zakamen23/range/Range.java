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

    public Range intersect(Range range) {

        if (to < range.from) {
            return null;
        } else if (range.from < from && from > range.to) {
            return null;
        } else if (range.from < from && to > range.to) { //(range.from < from && to > range.from && to > range.to)
            Range extraRange = new Range(from, to);
            extraRange.from = from;
            extraRange.to = range.to;
           // return extraRange;
        } else if (range.from < from && range.to > to) {
            Range extraRange = new Range(from, to);
            //return extraRange;
        } else if (to > range.from && range.to > to) {
            Range extraRange = new Range(from, to);
            extraRange.from = range.from;
           // return extraRange;
        } else if (range.from < to && range.to < to){

            return range;}
        Range extraRange = new Range(from, to);
        return extraRange;
    }
     /*public Range intersect(Range range) {
        if (to < range.from) {
            return null;
        } else if (range.from == to) {
            range.to = to;
            return range;
        } else if (range.from < from && from > range.to) {
            return null;
        } else if (range.from < from && to > range.to) { //(range.from < from && to > range.from && to > range.to)
            range.from = from; // начало второго интервала меньше первого
            return range;
        } else if (range.from < from && range.to > to) {
            range.from = from;
            range.to = to;
            return range;
        } else if (to > range.from && range.to > to) {
            range.to = to;
            return range;
        }
        return range;
    }*/

       /* public Range[] union (Range[]array, Range range){

            if (range.from > to) {


            }
      }
*/
    public String toString() {
        return "[" + from + " ; " + to + "]";
    }

}

