package io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.test;

import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.repository.Repository;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.repository.RepositoryDB;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.repository.RepositoryFile;
import io.github.miguel00roza.maratonajava.javacore.Mpolimorfismo.repository.RepositoryMemory;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryMemory();
        repository.save();
    }
}
