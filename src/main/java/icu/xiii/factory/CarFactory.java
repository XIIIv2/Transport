package icu.xiii.factory;

import icu.xiii.transport.Car;
import icu.xiii.transport.Transport;

public class CarFactory extends TransportFactory {

    /**
     *
     * @return new instance of Car
     */
    @Override
    public Transport createTransport() {
        System.out.println("Car factory creating new instance");
        return new Car();
    }
}
