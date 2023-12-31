package com.example.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        var songIndex = random.nextInt(3);
        if (genre.equals(MusicGenre.CLASSICAL)) {
            System.out.println("Playing: " + classicalMusic.getSong().get(songIndex));
        }
        else {
            System.out.println("Playing: " + rockMusic.getSong().get(songIndex));
        }
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
               "name='" + name + '\'' +
               ", volume=" + volume +
               '}';
    }
}
