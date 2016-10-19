package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 19.10.2016.
 */
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
