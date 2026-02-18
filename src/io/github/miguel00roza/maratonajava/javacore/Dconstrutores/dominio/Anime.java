package io.github.miguel00roza.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private int ageRestriction;
    private String studio;

    public Anime(String name, String type, int episodes, int ageRestriction) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.ageRestriction = ageRestriction;
    }

    // Sobrecarga de Construtor
    public Anime(String name, String type, int episodes, int ageRestriction, String studio) {
        this(name, type, episodes, ageRestriction);
        this.studio = studio;
        System.out.println("Dentro do construtor sobrecarregado");
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.ageRestriction);
        System.out.println(this.studio);
    }

    public String getType() {
        return type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getName() {
        return name;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }
}
