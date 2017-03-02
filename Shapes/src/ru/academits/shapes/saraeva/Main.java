package ru.academits.shapes.saraeva;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Евгения on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape.Square square = new Shape.Square(5);
        Shape.Rectangle rectangle = new Shape.Rectangle(4, 6);
        Shape.Rectangle rectangle2 = new Shape.Rectangle(8, 7);
        Shape.Triangle triangle = new Shape.Triangle(0, 0, 0, 3, 4, 0);
        Shape.Circle circle = new Shape.Circle(10);

        ArrayList<Double> areas = new ArrayList<>();
        areas.add(square.getArea());
        areas.add(rectangle.getArea());
        areas.add(rectangle2.getArea());
        areas.add(triangle.getArea());
        areas.add(circle.getArea());
        ArrayList<Double> perimeters = new ArrayList<>();
        areas.add(square.getPerimeter());
        areas.add(rectangle.getPerimeter());
        areas.add(rectangle2.getPerimeter());
        areas.add(triangle.getPerimeter());
        areas.add(circle.getPerimeter());

        System.out.println(getMaxSquare(areas, new AreasComparator()));
    }

    public static double getMaxSquare(ArrayList<Double> areas, Comparator<Double> comparator) {
        for (int i = 0; i < areas.size() - 1; ++i) {
            double temp = areas.get(i + 1);
            if (comparator.compare(temp, areas.get(i)) > 0) {
                continue;
            }
            int j = i + 1;
            while (j > 0 && comparator.compare(temp, areas.get(i)) <= 0) {

                areas.set(j, areas.get(j - 1));
                --j;
            }
            areas.set(j, temp);
        }
        System.out.println(areas);
        return areas.get(areas.size() - 1);
    }
}







 /* public static double getMaxSquare(double[] areas) {
        double temp = 0;
        for (int i = 0; i < areas.length; ++i) {
            if (areas[i] > temp) {
                temp = areas[i];
            }
        }
        return temp;
    }*/




