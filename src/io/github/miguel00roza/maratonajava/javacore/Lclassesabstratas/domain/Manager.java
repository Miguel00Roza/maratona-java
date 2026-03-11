package io.github.miguel00roza.maratonajava.javacore.Lclassesabstratas.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus(){
        this.salary += this.salary * 0.15;
    }
}
