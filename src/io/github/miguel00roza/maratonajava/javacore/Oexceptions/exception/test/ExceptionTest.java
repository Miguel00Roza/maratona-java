package io.github.miguel00roza.maratonajava.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        createNewFile();
    }

    private static void createNewFile(){
        // Coloquei a pasta root pois so alterar as permissoes da pasta "archive" nao estava funcionando
        File file = new File("/root/teste.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Created file: "+isCreated);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
