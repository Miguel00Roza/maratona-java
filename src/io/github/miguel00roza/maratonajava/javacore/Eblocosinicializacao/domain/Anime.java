package io.github.miguel00roza.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    public String name;
    public int[] episodes;
    // isso é um bloco de inicialização, ele sempre vai inicializar antes do construtor
    {
        System.out.println("Inside of the initialization block");
    }

    public Anime() {
        System.out.println(this.name);
        this.episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
        for(int episode: episodes) {
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
