package br.com.alura.mymusics.models;

public class MyFavorites {
    public void insert(Audio audio) {
        if (audio.getRatings() >= 9) {
            System.out.println(audio.getTitle() + " its popular and liked by all listeners!");
        } else {
            System.out.println(audio.getTitle() + " is our recommendation for you to listen to today!");
        }
    }
}
