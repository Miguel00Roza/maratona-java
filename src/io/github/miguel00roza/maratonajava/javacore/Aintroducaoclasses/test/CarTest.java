package io.github.miguel00roza.maratonajava.javacore.Aintroducaoclasses.test;

import io.github.miguel00roza.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Uno";
        car1.model = "Classic";
        car1.year = 1984;

        Car car2 = new Car();
        car2.name = "Grand siena";
        car2.model = "Essence";
        car2.year = 2014;

        System.out.println("Name: "+car1.name+", Model: "+car1.model+", Year: "+car1.year);
        System.out.println("Name: "+car2.name+", Model: "+car2.model+", Year: "+car2.year);
    }
}
