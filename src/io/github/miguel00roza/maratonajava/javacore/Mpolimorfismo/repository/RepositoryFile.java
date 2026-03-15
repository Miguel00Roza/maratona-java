package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.repository;

public class RepositoryFile implements Repository{
    @Override
    public void save() {
        System.out.println("Saving on file");
    }
}
