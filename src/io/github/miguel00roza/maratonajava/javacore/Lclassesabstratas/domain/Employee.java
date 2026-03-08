package io.github.miguel00roza.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Employee {
    // A classe abstrata funciona como um molde
    protected String name;
    protected double Salary;

    public Employee(String name, double salary) {
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
