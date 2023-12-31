package com.example.springcourse;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    private List<String> songs;

    public RapMusic() {
        songs = new ArrayList<>();
        songs.add("Rap God");
        songs.add("Lose Yourself");
        songs.add("A Milli");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
