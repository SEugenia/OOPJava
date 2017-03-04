package ru.academits.shapes.saraeva;

/**
 * Created by Евгения on 02.03.2017.
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override

    public double getWidth() {
        return 2 * radius;
    }

    @Override

    public double getHight() {
        return 2 * radius;
    }

    @Override

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "" + new Circle(radius) + "";
    }
}