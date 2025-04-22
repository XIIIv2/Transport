package icu.xiii.factory;

import icu.xiii.transport.Car;

public class CarFactory extends TransportFactory {

    /**
     *
     * @return new instance of Car
     */
    @Override
    public Car createTransport() {
        return new Car();
    }
}
