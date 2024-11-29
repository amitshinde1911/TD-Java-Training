package day2;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird flies by flapping wings");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane flies using engines");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();
        bird.fly();
        airplane.fly();
    }
}
