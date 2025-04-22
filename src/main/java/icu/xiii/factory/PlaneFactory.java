package icu.xiii.factory;

import icu.xiii.transport.Plane;

public class PlaneFactory extends TransportFactory {

    /**
     *
     * @return new instance of Plane
     */
    @Override
    public Plane createTransport() {
        return new Plane();
    }
}
