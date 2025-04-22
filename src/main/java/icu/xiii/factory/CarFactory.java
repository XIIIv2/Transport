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
        return new Car();
    }
}
