package icu.xiii.factory;

import icu.xiii.transport.Car;

public class CarFactory extends TransportFactory {

    public Car createTransport() {
        return new Car();
    }
}
