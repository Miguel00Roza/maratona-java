package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.test;

import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Computer;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Product;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Tomato;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.service.CalculateTax;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        Product product2 = new Tomato("sicilian tomato", 10);

        Tomato tomato = new Tomato("American", 20);
        tomato.setExpirationDate("11/05/2026");

        CalculateTax.calculateTax(tomato);
        CalculateTax.calculateTax(product);
    }
}
