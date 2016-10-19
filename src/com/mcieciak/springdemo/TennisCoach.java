package com.mcieciak.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Mateusz on 17.10.2016.
 */

@Component
public class TennisCoach implements Coach {

    //    @Qualifier mowi Springowi ktora konkretnie implementacje FortuneService ma wstrzyknac,
//    gdy jest ich kilka
    @Autowired
    @Qualifier("activityFortuneService")
    private FortuneService fortuneService;

    //    zdefiniowanie domyslnego konstruktora
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    //    zdefiniowanie metody ktora wykona sie od razu po inicjacji beana
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TennisCoach: inside init method");
    }

//    zdefiniowanie metody ktora wykona sie przed zniszczeniem beana
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("TennisCoach: inside destroy method");
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
