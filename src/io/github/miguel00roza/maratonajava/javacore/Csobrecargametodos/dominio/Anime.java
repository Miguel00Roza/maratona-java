package io.github.miguel00roza.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private int ageRestriction;

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    // Sobrecarga de metodos, quando temos 2 metodos com o mesmo nome porem com quantidade de parâmetros diferentes
    public void init(String name, String type, int episodes, int ageRestriction) {
        this.init(name, type, episodes);
        this.ageRestriction = ageRestriction;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.ageRestriction);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
