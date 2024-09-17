package com.exampleSpring.SpringExample.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringExampleRest {
    //injecting properties
    @Value("${coach.name}")
    private String coachname;
    @Value("${team.name}")
    private String teamname;
    //expose the endpoint teamInfo

    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "coach: "+ coachname +"team: "+ teamname;
    }
    @GetMapping("/")
    public String sayHello(){
        return "hello";
    }
    @GetMapping("/workout")
    public String GetWorkout(){
        return  "5k running";
    }


}
