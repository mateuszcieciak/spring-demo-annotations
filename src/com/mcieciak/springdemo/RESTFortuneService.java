package com.mcieciak.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by Mateusz on 18.10.2016.
 */
@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
