package com.example.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private int volume;
    private String name;

    private MusicPlayer() {}

    public static MusicPlayer getMusicPlayer() {
        System.out.println("factory method");
        return new MusicPlayer();
    }

    public void doMyInit() {
        System.out.println("MusicPlayer initialization...");
    }

    public void doMyDestroy() {
        System.out.println("MusicPlayer destruction...");
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList() {
        musicList.forEach(
                music -> System.out.println(music.getSong())
        );
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
               "musicList=" + musicList +
               ", volume=" + volume +
               ", name='" + name + '\'' +
               '}';
    }
}
