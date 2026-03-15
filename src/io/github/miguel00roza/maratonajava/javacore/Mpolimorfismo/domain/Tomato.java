package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain;

public class Tomato extends Product {
    public static final double TAX = 0.06;
    private String expirationDate;
    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tax of tomato");
        return this.price * TAX;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
