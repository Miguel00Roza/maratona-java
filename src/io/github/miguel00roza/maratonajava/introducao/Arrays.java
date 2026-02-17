package io.github.miguel00roza.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 30;
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        String[] nomes = {"Pedro", "Maria", "Joao", "Rafael"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // foreach
        // para usar foreach colocamos o tipo da array na frente e então a variável que vai receber o dado
        for (String nome : nomes) {
            System.out.println(nome);
        }
        for (int idade : idades) {
            System.out.println(idade);
        }
    }
}
