package ru.academits.shapes.saraeva;

/**
 * Created by Евгения on 26.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape.Square square = new Shape.Square(5);
        Shape.Rectangle rectangle = new Shape.Rectangle(4, 6);
        Shape.Rectangle rectangle2 = new Shape.Rectangle(8, 7);
        Shape.Triangle triangle = new Shape.Triangle(0, 0, 0, 3, 4, 0);
        Shape.Circle circle = new Shape.Circle(10);
        double[] areas = {square.getArea(), circle.getArea(), rectangle.getArea(), rectangle2.getArea(), triangle.getArea()};
        System.out.println(getMaxSquare(areas));
    }

    public static double getMaxSquare(double[] areas) {
        double temp = 0;
        for (int i = 0; i < areas.length; ++i) {
            if (areas[i] > temp) {
                temp = areas[i];
            }
        }
        return temp;
    }
}

