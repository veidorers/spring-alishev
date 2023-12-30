package com.example.springcourse;

public class MusicPlayer {
    private Music music;
    private int volume;
    private String name;

    public MusicPlayer() {}

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic() {
        System.out.println(music.getSong());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
               "music=" + music +
               ", volume=" + volume +
               ", name='" + name + '\'' +
               '}';
    }
}
