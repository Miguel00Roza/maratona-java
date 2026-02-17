package io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.test;

import io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.dominio.Printer;
import io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.dominio.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentBoy = new Student();
        Student studentGirl = new Student();
        Printer printer = new Printer();

        studentBoy.name = "Midorya";
        studentBoy.age = 16;
        studentBoy.gender = 'M';

        studentGirl.name = "Uraraka";
        studentGirl.age = 16;
        studentGirl.gender = 'F';

        printer.print(studentBoy);
        System.out.println("-----------------------------------");
        printer.print(studentGirl);

        // Parte 2 do Student test

        studentBoy.printData();
        studentGirl.printData();
    }
}
