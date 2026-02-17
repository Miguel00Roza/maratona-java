package io.github.miguel00roza.maratonajava.introducao;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        // Como imprimir uma matriz (Array multidimensional) com foreach
        for (int[] arrBase : dias) { // colocamos o [], pois ele vai pegar uma array de inteiros e não um número inteiro
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        // Inicialização
        int[][] arrInt = new int[3][];

        arrInt[0] = new int[]{1, 2, 3, 4, 5};
        arrInt[1] = new int[]{6, 7, 8};
        arrInt[2] = new int[]{9, 10, 11, 12, 13};

        int[][] arrIntDois = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] arrBase : arrInt) {
            System.out.println("----------------");
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
