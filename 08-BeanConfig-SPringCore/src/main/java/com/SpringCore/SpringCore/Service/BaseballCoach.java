package com.SpringCore.SpringCore.Service;

public class BaseballCoach implements Coach{
    public BaseballCoach(){
        System.out.println("In constructor"+getClass().getSimpleName());//for diagnostics
    }
    @Override
    public String getDailyWorkout() {
        return "practise baseball";
    }
}
