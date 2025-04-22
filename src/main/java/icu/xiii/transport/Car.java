package icu.xiii.transport;

public class Car implements Transport {

    public Car() {
        System.out.println("Car instance created.");
    }

    public void move() {
        System.out.println("Car::move()");
    }
}
