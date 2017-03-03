package ru.academits.shapes.saraeva;

import java.util.Comparator;

/**
 * Created by Евгения on 02.03.2017.
 */


public class PerimetersComparator implements Comparator<Shape> {

    public int compare(Shape shape1, Shape shape2) {
        if (shape1.getPerimeter() > shape2.getPerimeter()) {
            return 1;
        } else if (shape1.getPerimeter() < shape2.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }
}
