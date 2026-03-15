package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.test;

import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Computer;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Television;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Tomato;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.service.CalculateTax;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Tomato tomato = new Tomato("tomato", 10);
        Television television = new Television("Samsung 50\"", 5000);
        CalculateTax.calculateTax(computer);
        System.out.println("-----------------------------------");
        CalculateTax.calculateTax(tomato);
        System.out.println("-----------------------------------");
        CalculateTax.calculateTax(television);
    }
}
