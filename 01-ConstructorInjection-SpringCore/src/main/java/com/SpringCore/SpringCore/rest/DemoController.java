package com.SpringCore.SpringCore.rest;

import OutPackage.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define private field for dependecy injection
    private Coach myCoach;
    //define a Constructor for dependency injection
    @Autowired //optional if there is only one constructor
    public DemoController(Coach theCoach){
        this.myCoach=theCoach;
    }
    @GetMapping("/workout")
    public String getDailyworkout(){
        return myCoach.getDailyWorkout();
    }
}
