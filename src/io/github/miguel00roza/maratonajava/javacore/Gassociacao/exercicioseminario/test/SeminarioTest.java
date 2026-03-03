package io.github.miguel00roza.maratonajava.javacore.Gassociacao.exercicioseminario.test;

import io.github.miguel00roza.maratonajava.javacore.Gassociacao.exercicioseminario.domain.Aluno;
import io.github.miguel00roza.maratonajava.javacore.Gassociacao.exercicioseminario.domain.Local;
import io.github.miguel00roza.maratonajava.javacore.Gassociacao.exercicioseminario.domain.Professor;
import io.github.miguel00roza.maratonajava.javacore.Gassociacao.exercicioseminario.domain.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Miguel", 16);
        Aluno aluno2 = new Aluno("Pedro", 17);

        Professor professor = new Professor("Fabio", "Programação");

        Local local = new Local("Araquari - Colegio agricula");
        Local local2 = new Local("Joinville");

        Seminario seminario = new Seminario("Desenvolvimento web II", new Aluno[]{aluno1, aluno2}, local);
        Seminario seminario2 = new Seminario("Programação", new Aluno[]{aluno2, aluno1}, local2);

        professor.setSeminarios(new Seminario[]{seminario, seminario2});

        professor.print();
    }
}
