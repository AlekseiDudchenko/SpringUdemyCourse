package com.dudch.beans.xmlcontext;

import com.dudch.beans.xmlcontext.fortune.FortuneService;

public class PassengerCar implements Car {

    private final FortuneService fortuneService;

    PassengerCar(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public void drive() {
        System.out.println("Passenger car drives!");
    }

    @Override
    public void getDailyFortune() {
        System.out.println(fortuneService.getFortune());
    }
}
