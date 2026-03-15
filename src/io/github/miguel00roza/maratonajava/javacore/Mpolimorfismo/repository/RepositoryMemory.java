package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Saving on memory");
    }
}
