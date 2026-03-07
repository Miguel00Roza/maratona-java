package io.github.miguel00roza.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salary;

    public void print(){
        super.print();
        System.out.println(this.salary);
    }

    public void paymentReport(){
        System.out.println("Name: " + this.name + " Received R$" + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
