package com.mcieciak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mateusz on 18.10.2016.
 */
public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach=context.getBean("tennisCoach",Coach.class);

        Coach alphaCoach=context.getBean("tennisCoach",Coach.class);

        boolean result=(theCoach==alphaCoach);
        System.out.println("Czy to ten sam obiekt? "+result);
        System.out.println("Lokalizacja w pamieci theCoach: "+theCoach);
        System.out.println("Lokalizacja w pamieci alphaCoach: "+alphaCoach);

        context.close();
    }
}
