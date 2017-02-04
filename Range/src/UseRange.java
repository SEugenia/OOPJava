/**
 * Created by Евгения on 04.02.2017.
 */
public class UseRange {
    public static void main(String[] args) {
        Range interval = new Range(7, 12);
        System.out.println(interval.getLength());
        System.out.println(interval.isInside(11));

        interval.setFrom(9);
        interval.setTo(18);

        System.out.println(interval.getLength());
        System.out.println(interval.isInside(8));


    }
}
