package io.github.miguel00roza.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
        Tipos de dados primitivos:
        byte - 8 bits - valores de -128 a 127 - 1 byte
        short - 16 bits - valores de -32.768 a 32767 - 2 bytes
        int - 32 bits - valores de -2^32 a 2^32 - 1 - 4 bytes
        long - 64 bits - valores de -2^63 a 2^63 - 1 - requer sufixo L - 8 bytes
        float - 32 bits - precisão simples - requer sufixo f - 4 bytes
        double - 64 bits - precisão dupla - padrão para números decimais - 8 bytes
        char - 16 bits - armazena 1 caractere - 2 bytes
        boolean - 1 bit - guarda false or true - 1 bit
         */
        byte ageByte = 2;
        short ageShort = 10;
        int age = 16;
        long bigNumber = 1000000;
        float salaryFloat = 2500.0F;
        double salaryDouble = 2000.00;
        boolean isAdmin = true;
        char gender = 'M'; // traduz o caractere que colocamos para a tabela ASCII
        System.out.println(age);

        // Cast: quando você quer converter um valor de um tipo para outro tipo
        // caso você coloque um número que não caiba naquele tipo o java começa a cortar bits para conseguir armazenar

        int numeroCast = (int) 100000000000L;
        /* ele avisa que o número é grande demais, porem como isso é um cast
        ( por causa do (int) na frente) ele vai obrigar o java a rodar
        */
        System.out.println(numeroCast);

        // String
        /*
        String não é um tipo primitivo porem eu vou colocar aqui
        String é uma classe
        */

        String nome = "Miguel"; // Como string é uma classe você deve declarar com letra maiúscula

        System.out.println("Olá, meu nome é:" + nome);
    }
}
