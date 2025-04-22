package icu.xiii.transport;

public class Plane implements Transport {

    public Plane() {
        System.out.println("Plane instance created.");
    }

    public void move() {
        System.out.println("Plane::move()");
    }
}
