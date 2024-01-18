package com.luv2code.aopdemo.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;

@Service
public class TrafficFortuneServiceImpl implements TrafficFortuneService {
    @Override
    public String getFortune() {

        System.out.println("Inside getFortune()");

        // simulate a delay
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // return a fortune
        return "Expect heavy traffic this morning";
    }

    @Override
    public String getFortune(boolean tripWire) {
        System.out.println("Inside getFortune(tripWire)");
        if (tripWire) {
            throw new RuntimeException("Major Accident! Highway is closed");
        }

        return getFortune();
    }
}
