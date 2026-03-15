package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain;

public class Computer extends Product {
    public static final double TAX = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tax of computer");
        return this.price * TAX;
    }


}
