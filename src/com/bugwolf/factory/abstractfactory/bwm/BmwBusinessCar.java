package com.bugwolf.factory.abstractfactory.bwm;

import com.bugwolf.factory.abstractfactory.BusinessCar;

public class BmwBusinessCar implements BusinessCar {

    @Override
    public String getCar() {
        return "Bmw business";
    }
}
