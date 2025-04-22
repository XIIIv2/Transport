package icu.xiii.factory;

import icu.xiii.transport.Plane;

public class PlaneFactory extends TransportFactory {

    public Plane createTransport() {
        return new Plane();
    }
}
