package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.test;

import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Computer;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Product;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTax());
        System.out.println("---------------------");
        Product product2 = new Tomato("sicilian tomato", 10);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTax());
    }
}
