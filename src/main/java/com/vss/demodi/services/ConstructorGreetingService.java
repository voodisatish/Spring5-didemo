package com.vss.demodi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public String sayGreetings() {
        return "Hello - In ConstructoreGreetingService";
    }
}
