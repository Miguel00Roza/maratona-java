package io.github.miguel00roza.maratonajava.javacore.Csobrecargametodos.test;

import io.github.miguel00roza.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto Shippuden", "Shounen", 500);
        anime.print();
    }
}
