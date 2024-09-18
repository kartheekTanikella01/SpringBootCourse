package com.SpringCore.SpringCore.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practise baseball";
    }
}
