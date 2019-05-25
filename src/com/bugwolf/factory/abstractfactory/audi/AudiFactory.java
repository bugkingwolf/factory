package com.bugwolf.factory.abstractfactory.audi;

import com.bugwolf.factory.abstractfactory.BusinessCar;
import com.bugwolf.factory.abstractfactory.SportCar;
import com.bugwolf.factory.abstractfactory.factory.AudiSportCar;
import com.bugwolf.factory.abstractfactory.factory.CarFactory;

public class AudiFactory implements CarFactory {
    @Override
    public BusinessCar productBusinessCar() {
        return new AudiBusinessCar();
    }

    @Override
    public SportCar productSportCar() {
        return new AudiSportCar();
    }
}
