package com.bugwolf.factory.abstractfactory.factory;

import com.bugwolf.factory.abstractfactory.bwm.BmwBusinessCar;
import com.bugwolf.factory.abstractfactory.bwm.BmwSportCar;
import com.bugwolf.factory.abstractfactory.BusinessCar;
import com.bugwolf.factory.abstractfactory.SportCar;

public class BmwFactory implements CarFactory{
    @Override
    public BusinessCar productBusinessCar() {
        return new BmwBusinessCar();
    }

    @Override
    public SportCar productSportCar() {
        return new BmwSportCar();
    }
}
