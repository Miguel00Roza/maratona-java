package io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain;

public class Jogador {
    private String name;
    private Team team;

    public Jogador(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        if (team != null) {
            System.out.println(this.team.getName());
        } else {
            System.out.println("This player is not on any team");
        }
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
