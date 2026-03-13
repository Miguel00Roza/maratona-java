package io.github.miguel00roza.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("Removing from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in the database");
    }
}
