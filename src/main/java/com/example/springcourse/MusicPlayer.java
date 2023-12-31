package com.example.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Random random = new Random();
        int randomGenreIndex = random.nextInt(musicList.size());
        System.out.println("Playing: " + musicList.get(randomGenreIndex).getSong());
    }
}
