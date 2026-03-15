package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.service;

import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Computer;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Product;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.domain.Tomato;

public class CalculateTax {
//    public static void calculateComputer(Computer computer){
//        System.out.println("Resume tomato tax");
//        double tax = computer.calculateTax();
//        System.out.println("computer "+ computer.getName());
//        System.out.println("Price "+ computer.getPrice());
//        System.out.println("computer tax price "+ tax);
//    }

//    public static void calculateTomato(Tomato tomato){
//        System.out.println("Resume computer tax");
//        double tax = tomato.calculateTax();
//        System.out.println("tomato "+ tomato.getName());
//        System.out.println("Price "+ tomato.getPrice());
//        System.out.println("computer tax price "+ tax);
//    }

    public static void calculateTax(Product product){
        System.out.println("Tax resume");
        double tax = product.calculateTax();
        System.out.println("product: "+product.getName());
        System.out.println("Price: "+product.getPrice());
        System.out.println("Tax price: "+tax);
        // Verifica se o produto é um tomate ( Não decepcione o Java )
        if (product instanceof Tomato){
            Tomato tomato = (Tomato) product;
            System.out.println(tomato.getExpirationDate());

            // outra forma de obter a expirationDate:
            // String expirationDate = ((Tomato) product).getExpirationDate(); Faz um cast ja puxando o valor
        }

    }
}
