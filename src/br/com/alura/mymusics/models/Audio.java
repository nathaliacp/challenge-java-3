package br.com.alura.mymusics.models;

public class Audio {
    private String title; //titulo
    private int totalPlays; //totalReproduções
    private int totalLikes; //totalCurtidas
    private int ratings; //classificação

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRatings() {
        return ratings;
    }

    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalPlays++;
    }
}
