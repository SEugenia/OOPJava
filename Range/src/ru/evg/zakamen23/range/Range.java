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
        } else if (from > range.to) {
            return null;
        } else if (range.from < from && to > range.to) {
            Range extraRange = new Range(from, range.to);
            return extraRange;
        } else if (range.from < from && range.to > to) {
            Range extraRange = new Range(from, to);
            return extraRange;
        } else if (to > range.from && range.to > to) {
            Range extraRange = new Range(range.from, to);
            return extraRange;
        } else if (range.from < to && range.to < to) {
            Range extraRange = new Range(range.from, range.to);
            return extraRange;
        }
        //Range extraRange = new Range(from, to);
        return range;
    }

    public Range[] union(Range range) {
        if (to < range.from) {
            Range result1 = new Range(from, to);
            Range result2 = new Range(range.from, range.to);
            Range[] array = new Range[2];
            array[0] = result1;
            array[1] = result2;
            System.out.print("объединение ");
           /* for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        } else if (from > range.to) {
            Range result1 = new Range(range.from, range.to);
            Range result2 = new Range(from, to);
            Range[] array = new Range[2];
            array[0] = result1;
            array[1] = result2;
            System.out.print("объединение ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        } else if (range.from < from && to > range.to) {
            Range result = new Range(range.from, to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.print("объединение ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        } else if (range.from < from && range.to > to) {
            Range result = new Range(range.from, range.to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.print("объединение ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        } else if (to > range.from && range.to > to) {
            Range result = new Range(from, range.to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.print("объединение ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        } else if (range.from < to && range.to < to) {
            Range result = new Range(from, to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.print("объединение ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        }

        Range[] array = new Range[2];
        return array;
    }

    public Range[] difference(Range range) {
        if (to < range.from) {
            Range result = new Range(from, to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.println();
            System.out.print("разность ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        } else if (from > range.to) {
            Range result = new Range(from, to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.println();
            System.out.print("разность ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        } else if (range.from < from && to > range.to) {
            Range result = new Range(range.to, to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.println();
            System.out.print("разность ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        } else if (range.from < from && range.to > to) {
            System.out.println();
            System.out.print("разность null");
            return null;
        } else if (to > range.from && range.to > to) {
            Range result = new Range(from, range.from);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.println();
            System.out.print("разность ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        } else if (range.from < to && range.to < to) {
            Range result1 = new Range(from, range.from);
            Range result2 = new Range(range.to, to);
            Range[] array = new Range[2];
            array[0] = result1;
            array[1] = result2;
            System.out.println();
            System.out.print("разность ");
            /*for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }*/
            return array;
        }
        Range[] array = new Range[0];
        return array;
    }

    public String toString() {
        return "[" + from + " ; " + to + "]";
    }
}

   /* public Range[] union(Range range1, Range range2) {
        if (range1.to < range2.from) {
            Range result1 = new Range(range1.from, range1.to);
            Range result2 = new Range(range2.from, range2.to);
            Range[] array = new Range[2];
            array[0] = result1;
            array[1] = result2;
            System.out.print("объединение ");
            for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }
            return array;
        } else if (range1.from > range2.to) {
            Range result1 = new Range(range2.from, range2.to);
            Range result2 = new Range(range1.from, range1.to);
            Range[] array = new Range[2];
            array[0] = result1;
            array[1] = result2;
            System.out.print("объединение ");
            for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }
            return array;
        } else if (range2.from < range1.from && range1.to > range2.to) {
            Range result = new Range(range2.from, range1.to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.print("объединение ");
            for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }
            return array;
        } else if (range2.from < range1.from && range2.to > range1.to) {
            Range result = new Range(range2.from, range2.to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.print("объединение ");
            for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }
            return array;
        } else if (range1.to > range2.from && range2.to > range1.to) {
            Range result = new Range(range1.from, range2.to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.print("объединение ");
            for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }
            return array;
        } else if (range2.from < range1.to && range2.to < range1.to) {
            Range result = new Range(range1.from, range1.to);
            Range[] array = new Range[1];
            array[0] = result;
            System.out.print("объединение ");
            for (int i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }
            return array;
        }

        Range[] array = new Range[2];
        return array;
    }*/
