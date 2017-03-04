package ru.academits.shapes.saraeva;

import java.util.ArrayList;
import java.util.Collections;

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

        ArrayList<Shape> areas = new ArrayList<>();
        areas.add(square.getArea());
        areas.add(rectangle.getArea());
        areas.add(rectangle2.getArea());
        areas.add(triangle.getArea());
        areas.add(circle.getArea());

        ArrayList<Double> perimeters = new ArrayList<>();
        perimeters.add(square.getPerimeter());
        perimeters.add(rectangle.getPerimeter());
        perimeters.add(rectangle2.getPerimeter());
        perimeters.add(triangle.getPerimeter());

        Collections.sort(perimeters, new AreasComparator());
        System.out.println(perimeters.get(perimeters.size() - 2));
    }
}

