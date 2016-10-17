package com.mcieciak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mateusz on 17.10.2016.
 */
public class AnnotationDemoApp {

    public static void main(String[] args) {

//        Wczytanie pliku konfiguracyjnego Spring
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Wziecie bean ze spring-container
        Coach theCoach=context.getBean("tennisCoach", Coach.class);

//        Wywolanie metody na bean
        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
