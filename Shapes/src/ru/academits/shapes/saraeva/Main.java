package ru.academits.shapes.saraeva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Евгения on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Rectangle rectangle2 = new Rectangle(8, 7);
        Triangle triangle = new Triangle(0, 0, 0, 3, 4, 0);
        Circle circle = new Circle(10);

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

        Collections.sort(areas, new AreasComparator());
        System.out.println(areas.get(areas.size()-1));
    }
}

