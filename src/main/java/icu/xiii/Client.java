package icu.xiii;

import icu.xiii.factory.CarFactory;
import icu.xiii.factory.PlaneFactory;
import icu.xiii.transport.Car;
import icu.xiii.transport.Plane;
import icu.xiii.transport.Transport;

public class Client {

    public void run() {
        Transport car = new CarFactory()
                .createTransport();

        System.out.println("car is instance of " + car.getClass().getSimpleName());
        car.move();

        Transport plane = new PlaneFactory()
                .createTransport();

        System.out.println("plane is instance of " + plane.getClass().getSimpleName());
        plane.move();
    }
}
