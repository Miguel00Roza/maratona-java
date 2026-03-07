package io.github.miguel00roza.maratonajava.javacore.Jmodificadorfinal.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250;
    public final Custumer CUSTUMER = new Custumer();
    /*
    Modificador final: Definine uma variavel como constante, normalmente acompanhado do modificador static
    Qualquer variavel com esse modificador precisa de um valor definido, que pode ser dito em bloco de inicialização
    ou então no construtor da classe (Nesse caso precisariamos tirar o static)
     */

    public final void print(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
