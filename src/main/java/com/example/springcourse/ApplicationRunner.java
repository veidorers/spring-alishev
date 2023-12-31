package com.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        var computer = context.getBean("computer", Computer.class);
        computer.getMusicPlayer().playMusic();
        System.out.println(computer);
        context.close();
    }
}

