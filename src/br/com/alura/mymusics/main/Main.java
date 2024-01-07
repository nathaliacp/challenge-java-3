package br.com.alura.mymusics.main;

import br.com.alura.mymusics.models.Music;
import br.com.alura.mymusics.models.MyFavorites;
import br.com.alura.mymusics.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Formation");
        myMusic.setArtist("Beyoncé");

        for (int i = 0; i < 5000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("PodPah");
        myPodcast.setHost("Igão Underground");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 400; i++) {
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.insert(myMusic);
        favorites.insert(myPodcast);
    }
}
