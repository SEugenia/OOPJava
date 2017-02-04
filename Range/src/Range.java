/**
 * Created by Евгения on 04.02.2017.
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

        public boolean isInside(double number) {
            return number >= from && number <= to;
        }

        public double getLength() {
            return to - from;
        }
}
