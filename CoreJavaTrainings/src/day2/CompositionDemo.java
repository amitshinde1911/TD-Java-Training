package day2;

class Address {
    String city, state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println(name + " lives in " + address.city + ", " + address.state);
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Address address = new Address("Pune", "Maharashtra");
        Person person = new Person("Amit", address);
        person.displayDetails();
    }
}

