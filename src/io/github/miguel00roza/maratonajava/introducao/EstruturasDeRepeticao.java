package io.github.miguel00roza.maratonajava.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        count = 0;

        // do while (Sinceramente acho que quase não se usa)
        do {
            System.out.println(count);
            count++;
        } while (count <= 10);

        // for
        for (int i = 0; i < 15; i++) {
            System.out.println("For:");
        }
    }
}
