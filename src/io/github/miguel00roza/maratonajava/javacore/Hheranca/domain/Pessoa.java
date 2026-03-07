package io.github.miguel00roza.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco endereco;
    /*
    Atributo protected: Permite acesso a propriedades do mesmo pacote ou então de suas subclasses
     */


    public void print() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
