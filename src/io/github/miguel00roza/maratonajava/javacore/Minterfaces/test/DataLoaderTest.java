package io.github.miguel00roza.maratonajava.javacore.Minterfaces.test;

import io.github.miguel00roza.maratonajava.javacore.Minterfaces.domain.DataLoader;
import io.github.miguel00roza.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import io.github.miguel00roza.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();

        DatabaseLoader.retriveMaxDataSize();
        DataLoader.retriveMaxDataSize();

        fileLoader.load();
        fileLoader.remove();
        fileLoader.remove();
    }
}
