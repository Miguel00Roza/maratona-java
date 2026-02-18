package io.github.miguel00roza.maratonajava.javacore.Dconstrutores.test;

import io.github.miguel00roza.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Sports", 85, 14);
        anime = new Anime("Haikyuu", "Sports", 85, 14, "production IG");

        anime.print();

    }
}
