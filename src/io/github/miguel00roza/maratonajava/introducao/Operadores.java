package io.github.miguel00roza.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Arimetricos: +, -, *, /, %
        int numero1 = 50;
        int numero2 = 17;
        System.out.println(numero1 + numero2);

        // Operadores Relacionais
        // >, <, ==, >=, <=, !=

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        // Operadores Logicos
        // AND - &&
        // OR - ||
        // NOT - !

        int idade = 29;
        float salario = 3500F;
        boolean isOnLawHigherTanThirty = idade >= 30 && salario >= 4612;
        boolean isOnLawLowerTanThirty = idade < 30 && salario >= 3381;
        System.out.println(isOnLawHigherTanThirty);
        System.out.println(isOnLawLowerTanThirty);

        double currentAccount = 670;
        double savingsAccount = 1400;
        double price = 870;
        boolean canBuy = currentAccount >= price || savingsAccount >= price;
        System.out.println(canBuy);

        // Operadores de atribuição
        // = += -= *= /= %= ++ --
        double bonus = 1800;
        salario += bonus;

    }
}
