package ru.academits.shapes.saraeva;

/**
 * Created by Евгения on 26.02.2017.
 */
public interface Shape {
    double getWidth();

    double getHight();

    double getArea();

    double getPerimeter();


    class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getWidth() {
            return side;
        }

        @Override
        public double getHight() {
            return side;
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public double getPerimeter() {
            return 4 * side;
        }
    }

    class Rectangle implements Shape {
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
        public double getHight() {
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
    }

    class Circle implements Shape {
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
    }

    class Triangle implements Shape {
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

        @Override
        public double getWidth() {
            return Math.max(Math.max(x1, x2), x3) - Math.min(Math.min(x1, x2), x3);
        }

        @Override
        public double getHight() {
            return Math.max(Math.max(y1, y2), y3) - Math.min(Math.min(y1, y2), y3);
        }

        @Override
        public double getArea() {
            return 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));

        }

        @Override
        public double getPerimeter() {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)) + Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        }
    }
}