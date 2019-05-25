package com.bugwolf.factory.abstractfactory.factory;

import com.bugwolf.factory.abstractfactory.SportCar;

public class AudiSportCar implements SportCar {

    @Override
    public String getCar() {
        return "Audi sport";
    }
}
