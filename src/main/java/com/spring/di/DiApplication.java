package com.spring.di;

import com.spring.di.controller.ConstructorInjectedController;
import com.spring.di.controller.MyController;
import com.spring.di.controller.PropertyInjectedController;
import com.spring.di.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);
        System.out.println("----------------- property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----------------- setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------------------- constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


    }

}
