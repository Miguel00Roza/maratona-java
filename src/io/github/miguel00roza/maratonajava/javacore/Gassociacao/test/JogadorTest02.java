package io.github.miguel00roza.maratonajava.javacore.Gassociacao.test;

import io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain.Jogador;
import io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain.Team;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar");
        Jogador j2 = new Jogador("Vinicius junior");

        Team time = new Team("Selecao brasileira");

        j2.setTeam(time);

        j1.print();
        j2.print();
    }
}
