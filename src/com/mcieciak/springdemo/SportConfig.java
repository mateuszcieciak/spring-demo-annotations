package com.mcieciak.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Mateusz on 19.10.2016.
 */
@Configuration
//@ComponentScan("com.mcieciak.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    //  umozliwienie odczytu ${}
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


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
