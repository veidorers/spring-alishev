package com.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private Integer id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        id = 5;
        this.musicPlayer = musicPlayer;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
               "id=" + id +
               ", musicPlayer=" + musicPlayer +
               '}';
    }
}
