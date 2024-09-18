package com.SpringCore.SpringCore.Service;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor"+getClass().getSimpleName());//for diagnostics
    }



    @Override
    public String getDailyWorkout() {
        return "run 5k ";
    }
}
