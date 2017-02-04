package ru.evg.zakamen23.ru.evg.zakamen23.range;


public class UseRange {
    public static void main(String[] args) {
        Range interval = new Range(7, 12);
        System.out.println(interval.getLength());
        System.out.println(interval.isInside(11));

        interval.setFrom(9);
        interval.setTo(18);

        System.out.println(interval.getFrom());
        System.out.println(interval.getTo());

        System.out.println(interval.getLength());
        System.out.println(interval.isInside(8));


    }

    public static class Range {
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
    }
}
