package com.SpringCore.SpringCore.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor"+getClass().getSimpleName());//for diagnostics
    }
    //define init method
    @PostConstruct
    public void startupstuff(){
        System.out.println("startup stuff " +getClass().getSimpleName());

    }
    //define destroymethod
    @PreDestroy
    public void endUp(){
        System.out.println("destroy method "+ getClass().getSimpleName());

    }




    @Override
    public String getDailyWorkout() {
        return "run 5k ";
    }
}
