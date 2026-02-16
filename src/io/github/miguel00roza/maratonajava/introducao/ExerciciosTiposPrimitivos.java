package io.github.miguel00roza.maratonajava.introducao;

import java.sql.SQLOutput;

public class ExerciciosTiposPrimitivos {
    /*
    Pratica
    Crie variáveis para os campos descritos entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
     */
    public static void main(String[] args) {
        String nome = "Kaneki";
        String endereco = "Rua do Kaneki";
        double salario = 3500;
        String dataRecebimentoSalario = "05/02/2026";

        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
