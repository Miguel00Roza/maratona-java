package io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.dominio;

public class People {
    private String name;
    private int age;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("This field cannot be empty");
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
