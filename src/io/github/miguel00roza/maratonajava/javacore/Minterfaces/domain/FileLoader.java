package io.github.miguel00roza.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from archive");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from archive");
    }
}
