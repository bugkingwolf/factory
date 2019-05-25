package com.bugwolf.factory.abstractfactory.bwm;

import com.bugwolf.factory.abstractfactory.SportCar;

public class BmwSportCar implements SportCar {

    @Override
    public String getCar() {
        return "Bmw sport";
    }
}
