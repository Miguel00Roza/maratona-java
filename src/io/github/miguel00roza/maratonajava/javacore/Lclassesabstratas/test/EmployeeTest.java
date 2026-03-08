package io.github.miguel00roza.maratonajava.javacore.Lclassesabstratas.test;

import io.github.miguel00roza.maratonajava.javacore.Lclassesabstratas.domain.Developer;
import io.github.miguel00roza.maratonajava.javacore.Lclassesabstratas.domain.Employee;
import io.github.miguel00roza.maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        // Employee employee = new Employee("Zoro", 2000); Não podemos criar um objeto de classe abstrata
        Manager manager = new Manager("Luffy", 3500);
        Developer developer = new Developer("Usopp", 15000);
        System.out.println(manager);
        System.out.println(developer);
    }
}
