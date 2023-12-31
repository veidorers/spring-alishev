package com.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs;

    public ClassicalMusic() {
        songs = new ArrayList<>();
        songs.add("Hungarian Rhapsody");
        songs.add("The Four Seasons");
        songs.add("Dance of the Knights");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
