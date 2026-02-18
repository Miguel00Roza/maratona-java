package io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.test;

import io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.dominio.People;

public class PeopleTest {
    public static void main(String[] args) {
        People people = new People();
        people.setName("Jiraya");
        people.setAge(70);

        System.out.println(people.getName());
        System.out.println(people.getAge());
    }
}
