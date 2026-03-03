package io.github.miguel00roza.maratonajava.javacore.Gassociacao.test;

import io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain.School;
import io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Jiraya");
        Teacher t2 = new Teacher("Orochimaru");
        Teacher t3 = new Teacher("Tsunade");
        School school = new School("Konoha", new Teacher[]{t1, t2, t3});

        school.print();
    }
}
