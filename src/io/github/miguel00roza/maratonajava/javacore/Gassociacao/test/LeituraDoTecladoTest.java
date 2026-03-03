package io.github.miguel00roza.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter M or F for gender");
        char gender = input.next().charAt(0);

        System.out.println(name + " " + age + " " + gender);
    }
}
