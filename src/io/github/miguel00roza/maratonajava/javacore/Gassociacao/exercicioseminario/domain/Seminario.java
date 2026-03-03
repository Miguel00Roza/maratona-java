package io.github.miguel00roza.maratonajava.javacore.Gassociacao.exercicioseminario.domain;

public class Seminario {
    private String nome;
    private Aluno[] alunos;
    private Local local;

    public void print() {
        if (this.alunos == null) System.out.println("Não há alunos cadastrados");
        else {
            System.out.println("Alunos:");
            for (int i = 0; i < this.alunos.length; i++) {
                System.out.println(i + 1 + "-" + this.alunos[i].getNome());
            }
        }
        System.out.println("Local: " + this.local.getNome());
    }

    public Seminario(String nome, Aluno[] alunos, Local local){
        this.nome = nome;
        this.alunos = alunos;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
}
