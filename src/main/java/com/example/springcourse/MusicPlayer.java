package com.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
//                       @Qualifier("rockMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }


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
}
