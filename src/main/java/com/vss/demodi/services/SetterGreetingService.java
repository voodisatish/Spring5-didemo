package com.vss.demodi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello - In SetterGreetingService";
    }
}
