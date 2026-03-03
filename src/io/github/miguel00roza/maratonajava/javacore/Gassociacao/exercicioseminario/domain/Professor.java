package io.github.miguel00roza.maratonajava.javacore.Gassociacao.exercicioseminario.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("------------Seminarios--------------");
        for (int i = 0; i < seminarios.length; i++) {
            System.out.println((i+1)+"-"+seminarios[i].getNome());
            seminarios[i].print();
            System.out.println("--------------------------------------");
        }
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
