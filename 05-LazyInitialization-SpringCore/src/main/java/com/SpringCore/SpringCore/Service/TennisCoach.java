package com.SpringCore.SpringCore.Service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy //Spring.main.lazy-initialization=true in application properties
@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor"+getClass().getSimpleName());//for diagnostics

    }
    @Override
    public String getDailyWorkout() {
        return "practise tennis";
    }
}
