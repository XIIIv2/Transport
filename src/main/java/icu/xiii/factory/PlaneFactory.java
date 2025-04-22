package icu.xiii.factory;

import icu.xiii.transport.Plane;
import icu.xiii.transport.Transport;

public class PlaneFactory extends TransportFactory {

    /**
     *
     * @return new instance of Plane
     */
    @Override
    public Transport createTransport() {
        System.out.println("Plane factory creating new instance");
        return new Plane();
    }
}
