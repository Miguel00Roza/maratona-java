package io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain;

public class Team {
    private String name;
    private Jogador[] jogadores;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Jogador[] jogadores) {
        this.name = name;
        this.jogadores = jogadores;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        if (this.jogadores == null) return;
        for (Jogador jogador: jogadores) {
            System.out.println(jogador.getName());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
