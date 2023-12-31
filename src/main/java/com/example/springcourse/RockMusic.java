package com.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RockMusic implements Music {
    private List<String> songs;

    public RockMusic() {
        songs = new ArrayList<>();
        songs.add("Wind cries Mary");
        songs.add("Smells Like Teen Spirit");
        songs.add("Whole Lotta Love");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
