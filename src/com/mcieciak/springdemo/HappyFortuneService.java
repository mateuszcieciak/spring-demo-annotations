package com.mcieciak.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by Mateusz on 17.10.2016.
 */

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
