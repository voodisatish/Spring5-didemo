package com.vss.demodi.controller;

import com.vss.demodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        System.out.println("Hey Hello !!");
        return greetingService.sayGreetings();
    }
}

