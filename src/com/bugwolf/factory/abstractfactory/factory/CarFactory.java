package com.bugwolf.factory.abstractfactory.factory;

import com.bugwolf.factory.abstractfactory.BusinessCar;
import com.bugwolf.factory.abstractfactory.SportCar;

public interface CarFactory {
    BusinessCar productBusinessCar();
    SportCar productSportCar();
}
