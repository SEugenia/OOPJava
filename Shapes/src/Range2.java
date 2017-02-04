package ru.evg.zakamen.evg.zakamen22;

public class Range2 {
    private double from1;
    private double to1;
    private double from2;
    private double to2;

    public Range2(double from1, double to1, double from2, double to2) {
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

    public double getFrom1() {
        return from1;
    }

    public void checkInterval() {
        if (from1 > to1) {
            double temp1;
            temp1 = from1;
            from1 = to1;
            to1 = temp1;
        }
        if (from2 > to2) {

            double temp2;
            temp2 = from2;
            from2 = to2;
            to2 = temp2;
        }
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

    public void changeLineSegments() {
        double tempFrom;
        double tempTo;
        if (from2 < from1) {
            tempFrom = from1;
            from1 = from2;
            from2 = tempFrom;
            tempTo = to1;
            to1 = to2;
            to2 = tempTo;
        }
    }

    public String getIntersection() {
        checkInterval();
        changeLineSegments();
        if (to1 == from2) {
            return "пересечение {" + from2 + "}";
        } else if (from2 <= to1 && to2 >= to1) {
            return "пересечение [" + from2 + " ; " + to1 + "]";
        } else if (from2 <= to1 && to2 <= to1) {
            return "пересечение [" + from2 + " ; " + to2 + "]";
        }
        return null;
    }

    public String getUnion() {
        checkInterval();
        changeLineSegments();
        if (from2 > to1) {
            return "объединение [" + from1 + " ; " + to1 + "] [" + from2 + " ; " + to2 + "]";
        } else if (to2 <= to1) {
            return "объединение [" + from1 + " ; " + to1 + "]";
        }
        return "объединение [" + from1 + " ; " + to2 + "]";
    }

    public String getDifference() {
        checkInterval();
        changeLineSegments();
        if (from2 >= to1) {
            return "разность [" + from1 + " ; " + to1 + "]";
        } else if (to2 >= to1) {
            return "разность [" + from1 + " ; " + from2 + "]";
        }
        return "разность [" + from1 + " ; " + from2 + "] [" + to2 + " ; " + to1 + "]";
    }
}
