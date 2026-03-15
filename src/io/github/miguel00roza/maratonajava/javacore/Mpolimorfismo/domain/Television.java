package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain;

public class Television extends Product {
    public static final double TAX = 0.15;
    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating television tax");
        return this.price * TAX;
    }
}
