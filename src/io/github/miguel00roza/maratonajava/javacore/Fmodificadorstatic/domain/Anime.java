package io.github.miguel00roza.maratonajava.javacore.Fmodificadorstatic.domain;

public class Anime {
    public String name;
    public static int[] episodes;

    static {
        System.out.println("Inside of the initialization block");
    }

    public Anime(String name) {
        this.name = name;
        System.out.println(this.name);
        Anime.episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
        for (int episode : episodes) {
            System.out.println(episode);
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
