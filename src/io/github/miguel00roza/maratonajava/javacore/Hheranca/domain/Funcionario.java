package io.github.miguel00roza.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public void print(){
        super.print();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
