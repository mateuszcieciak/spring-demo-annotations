package com.mcieciak.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by Mateusz on 17.10.2016.
 */

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
