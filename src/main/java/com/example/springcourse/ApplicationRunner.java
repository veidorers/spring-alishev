package com.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicGenre.ROCK);
        System.out.println(musicPlayer);

        var classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        var classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}

