package io.github.miguel00roza.maratonajava.javacore.Gassociacao.test;

import io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar");
        Jogador j2 = new Jogador("ViniJr");
        Jogador j3 = new Jogador("Casemiro");

        Jogador[] jogadores = new Jogador[]{j1, j2, j3};

        for(Jogador jogador: jogadores) {
            System.out.println(jogador.getName());
        }
    }
}
