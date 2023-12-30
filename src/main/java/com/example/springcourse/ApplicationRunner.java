package com.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        MusicPlayer musicPlayer2 = new MusicPlayer(context.getBean("rockMusic", Music.class));
        musicPlayer2.playMusic();
    }
}

