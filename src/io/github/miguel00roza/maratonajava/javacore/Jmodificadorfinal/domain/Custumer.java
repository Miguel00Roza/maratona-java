package io.github.miguel00roza.maratonajava.javacore.Jmodificadorfinal.domain;

public class Custumer {
    private String name;

    @Override
    public String toString() {
        return "Custumer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
