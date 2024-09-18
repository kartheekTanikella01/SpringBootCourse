package com.SpringCore.SpringCore.Rest;

import com.SpringCore.SpringCore.Service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define private field for dependecy injection
    private Coach myCoach;
    private Coach anotherCoach;
    //define a Constructor for dependency injection
    @Autowired //optional if there is only one constructor
    public DemoController(@Qualifier("cricketCoach") Coach theCoach,
                          @Qualifier("cricketCoach") Coach theAnotherCoach){
        System.out.println("In constructor1"+getClass().getSimpleName());//for diagnostics
        myCoach=theCoach;
        anotherCoach=theAnotherCoach;



    }
    //Even though primary is given to baseballclass,here the qualifier class will be implemented because qualifier has higher priority
    @GetMapping("/workout")
    public String getDailyworkout(){
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/check")
    public String check(){
        return "compare mycoach==anothercoach "+( myCoach==anotherCoach);
    }
}
