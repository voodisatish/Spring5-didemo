package com.vss.demodi;

import com.vss.demodi.controller.ConstructorInjectionController;
import com.vss.demodi.controller.GreetingController;
import com.vss.demodi.controller.PropertyInjectionController;
import com.vss.demodi.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemoDiApplication.class, args);

        GreetingController gctr = (GreetingController) ctx.getBean("greetingController");
        //gctr.sayHello();

        System.out.println(gctr.sayHello());
        System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
    }

}
