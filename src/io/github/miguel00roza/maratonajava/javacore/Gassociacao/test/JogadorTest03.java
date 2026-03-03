package io.github.miguel00roza.maratonajava.javacore.Gassociacao.test;

import io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain.Jogador;
import io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain.Team;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("cafu");
        Jogador j2 = new Jogador("Ronaldinho");
        Jogador j3 = new Jogador("Neymar");

        Team team = new Team("Barcelona");

        j1.setTeam(team);
        j2.setTeam(team);
        j3.setTeam(team);

        team.setJogadores(new Jogador[]{j1, j2, j3});

        team.print();
        j1.print();
        j2.print();
        j3.print();
    }
}
