package io.github.miguel00roza.maratonajava.javacore.Fmodificadorstatic.test;

import io.github.miguel00roza.maratonajava.javacore.Fmodificadorstatic.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime.episodes = new int[]{1, 2, 3, 4, 5};

        Anime a1 = new Anime("One piece");
        Anime a2 = new Anime("Naruto");
        Anime a3 = new Anime("Bleach");
    }
}
