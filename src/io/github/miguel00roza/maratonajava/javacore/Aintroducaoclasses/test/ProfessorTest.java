package io.github.miguel00roza.maratonajava.javacore.Aintroducaoclasses.test;

import io.github.miguel00roza.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Kakashi";
        professor.age = 35;
        professor.gender = 'M';

        String dataProfessor = "Name: "+professor.name+", age: "+professor.age+", Gender: "+professor.gender;
        System.out.println(dataProfessor);
    }
}
