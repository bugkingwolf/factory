package com.bugwolf.factory.abstractfactory.audi;

import com.bugwolf.factory.abstractfactory.BusinessCar;

public class AudiBusinessCar implements BusinessCar {

    @Override
    public String getCar() {
        return "Audi business";
    }
}
