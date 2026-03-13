package io.github.miguel00roza.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    void load(); // é automaticamente public abstract

    // default: permite colocar corpo no metodo e nao obriga todas as classes concretas a implementar o metodo novo
    default void checkPermission(){
        System.out.println("Checking permission");
    }
}
