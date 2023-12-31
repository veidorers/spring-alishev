package com.example.springcourse;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    private List<String> songs;

    @PostConstruct
    public void doMyInit() {
        System.out.println("ClassicalMusic initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("ClassicalMusic destruction");
    }

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
