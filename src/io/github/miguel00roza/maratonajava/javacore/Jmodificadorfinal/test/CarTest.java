package io.github.miguel00roza.maratonajava.javacore.Jmodificadorfinal.test;

import io.github.miguel00roza.maratonajava.javacore.Jmodificadorfinal.domain.Car;
import io.github.miguel00roza.maratonajava.javacore.Jmodificadorfinal.domain.Custumer;
import io.github.miguel00roza.maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.CUSTUMER);
        car.CUSTUMER.setName("Kuririn");
        System.out.println(car.CUSTUMER);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();
    }
}
