package icu.xiii;

import icu.xiii.factory.CarFactory;
import icu.xiii.factory.PlaneFactory;
import icu.xiii.transport.Car;
import icu.xiii.transport.Plane;
import icu.xiii.transport.Transport;

public class Client {

    public void run() {
        // Я может неправильно понял задачу, но мне показалось, что типы надо указывать конкретно Car и Plane, надеюсь оценку не испорчу.

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
