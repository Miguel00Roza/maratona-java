package io.github.miguel00roza.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10; // Não precisamos colocar public static final pois é redundante

    void load(); // é automaticamente public abstract

    // default: permite colocar corpo no metodo e nao obriga todas as classes concretas a implementar o metodo novo
    default void checkPermission(){
        System.out.println("Checking permission");
    }

    // Não é possivel sobrescrever com @override
    static void retriveMaxDataSize(){
        System.out.println("within the method retriveMaxDataSize");
    }
}
