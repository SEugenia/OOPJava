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

    public double getHeight() {
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
        return "" + "окр-дл:" + getPerimeter() + " кр-пл: " + getArea() + "";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if ((o == null) || o.getClass() != this.getClass())
            return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + (int) radius;
        return hash;
    }
}