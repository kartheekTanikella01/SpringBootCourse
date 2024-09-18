package com.SpringCore.SpringCore.Service;


import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach(){
        System.out.println("In constructor"+getClass().getSimpleName());//for diagnostics
    }
    @Override
    public String getDailyWorkout() {
        return "practise baseball";
    }
}
