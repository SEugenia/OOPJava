package ru.academits.shapes.saraeva;

/**
 * Created by Евгения on 02.03.2017.
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override

    public double getWidth() {
        return width;
    }

    @Override

    public double getHeight() {
        return height;
    }

    @Override

    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public String toString() {
        return "" + "прям-пер:" + getPerimeter() + " прям-пл: " + getArea() + "";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if ((o == null) || o.getClass() != this.getClass())
            return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height && width == rectangle.width;
    }

    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + (int) height;
        hash = prime * hash + (int) width;
        return hash;
    }
}
