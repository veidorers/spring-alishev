package com.example.springcourse;

import org.springframework.stereotype.Component;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap God";
    }
}
