package day2;

class Shape {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of Circle: " + shape.calculateArea(7));
        System.out.println("Area of Rectangle: " + shape.calculateArea(5, 10));
    }
}

