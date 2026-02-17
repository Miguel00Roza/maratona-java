package io.github.miguel00roza.maratonajava.javacore.introducaoclasses.test;

import io.github.miguel00roza.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Naruto";
        estudante.idade = 17;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
