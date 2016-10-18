package com.mcieciak.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Mateusz on 17.10.2016.
 */

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

//    @Qualifier mowi Springowi ktora konkretnie implementacje FortuneService ma wstrzyknac,
//    gdy jest ich kilka
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //    zdefiniowanie domyslnego konstruktora
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService) {
//        System.out.println(">> TennisCoach: inside default doSomeCrazyStuff() method");
//        fortuneService = theFortuneService;
//    }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService=theFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
