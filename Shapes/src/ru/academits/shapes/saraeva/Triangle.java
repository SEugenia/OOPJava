package ru.academits.shapes.saraeva;

/**
 * Created by Евгения on 03.03.2017.
 */
public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private double calcDistance(double number1, double number2, double number3) {
        return Math.max(Math.max(number1, number2), number3) - Math.min(Math.min(number1, number2), number3);
    }

    @Override

    public double getWidth() {
        return calcDistance(x1, x2, x3);
    }

    @Override

    public double getHeight() {
        return calcDistance(y1, y2, y3);
    }

    @Override

    public double getArea() {
        return 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
    }

    @Override

    public double getPerimeter() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)) + Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    }

    public String toString() {
        return "" + "тр-пер:" + getPerimeter() + " тр-пл: " + getArea() + "";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if ((o == null) || o.getClass() != this.getClass())
            return false;
        Triangle triangle = (Triangle) o;
        return x1 == triangle.x1 && y1 == triangle.y1 && x2 == triangle.x2 && y2 == triangle.y2 && x3 == triangle.x3 && y3 == triangle.y3;
    }

    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + (int) x1;
        hash = prime * hash + (int) y1;
        hash = prime * hash + (int) x2;
        hash = prime * hash + (int) y2;
        hash = prime * hash + (int) x3;
        hash = prime * hash + (int) y3;
        return hash;
    }
}

