package day1;

public class MethodOverloadingDemo {
    public static int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public static int calculateArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        int rectangleArea = calculateArea(5, 10);
        int squareArea = calculateArea(7);
        
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of square: " + squareArea);
    }
}

