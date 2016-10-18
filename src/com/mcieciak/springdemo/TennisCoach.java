package com.mcieciak.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Mateusz on 17.10.2016.
 */

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
