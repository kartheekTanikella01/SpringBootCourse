package com.SpringCore.SpringCore.Service;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practise tennis";
    }
}
