package com.SpringCore.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "run 5k ";
    }
}
