package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.repository;

public class RepositoryDB implements Repository {
    @Override
    public void save() {
        System.out.println("Saving on data base");
    }
}
