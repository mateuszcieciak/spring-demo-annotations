package com.mcieciak.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Mateusz on 17.10.2016.
 */
public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

//        Wczytanie pliku konfiguracyjnego Spring
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SportConfig.class);

//        Wziecie bean ze spring-container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

//        Wywolanie metody na bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();

    }
}
