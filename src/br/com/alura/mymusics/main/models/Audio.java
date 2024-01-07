package br.com.alura.mymusics.main.models;

public class Audio {
    private String title; //titulo
    private int totalPlays; //totalReproduções
    private int totalLikes; //totalCurtidas
    private double ratings; //classificação

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

    public double getRatings() {
        return ratings;
    }

    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalPlays++;
    }
}
