package day2;

class Vehicle {
    String brand = "Generic";

    public void start() {
        System.out.println(brand + " Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.displayDetails();
    }
}

