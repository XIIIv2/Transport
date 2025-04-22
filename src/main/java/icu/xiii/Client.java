package icu.xiii;

import icu.xiii.factory.CarFactory;
import icu.xiii.factory.PlaneFactory;
import icu.xiii.transport.Car;
import icu.xiii.transport.Plane;
import icu.xiii.transport.Transport;

public class Client {

    public void run() {
        //Transport car = new CarFactory()
        Car car = new CarFactory()
                .createTransport();

        //Transport plane = new PlaneFactory()
        Plane plane = new PlaneFactory()
                .createTransport();

        car.move();
        plane.move();
    }
}
