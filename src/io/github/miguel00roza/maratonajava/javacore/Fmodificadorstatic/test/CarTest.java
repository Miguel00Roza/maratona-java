package io.github.miguel00roza.maratonajava.javacore.Fmodificadorstatic.test;

import io.github.miguel00roza.maratonajava.javacore.Fmodificadorstatic.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Mercedes", 275);
        Car c3 = new Car("Audi", 290);

        Car.setSpeedLimit(180);
        System.out.println("speed limit: " + Car.getSpeedLimit());

        c1.print();
        c2.print();
        c3.print();
    }
}
