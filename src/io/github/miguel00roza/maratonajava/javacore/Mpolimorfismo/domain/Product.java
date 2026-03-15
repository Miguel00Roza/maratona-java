package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain;

public abstract class Product implements Tax{
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
