package io.github.miguel00roza.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Employee {
    // A classe abstrata funciona como um molde
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public abstract void calculateBonus();
    // Sou obrigado a sobrescrever metodos abstratos nos metodos concretos
}
