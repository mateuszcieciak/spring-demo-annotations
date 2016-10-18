package com.mcieciak.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Mateusz on 18.10.2016.
 */
@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {"111", "222", "333"};

    private Random rnd = new Random();

    @Override
    public String getFortune() {
        int index = rnd.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
