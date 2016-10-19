package com.mcieciak.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Mateusz on 19.10.2016.
 */
@Configuration
//@ComponentScan("com.mcieciak.springdemo")
public class SportConfig {

    //    definiowanie beana dla SadFortuneService
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //    definiowanie beana dla SwimCoach i wstrzykniecie zaleznosci
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }


}
