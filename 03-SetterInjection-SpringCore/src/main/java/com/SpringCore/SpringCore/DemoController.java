package com.SpringCore.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define private field for dependecy injection
    private Coach myCoach;
    @Autowired
   public void setCoach(Coach theCoach){
       myCoach=theCoach;

   }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
