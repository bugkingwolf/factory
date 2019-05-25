package com.bugwolf.factory.functionfactory.factory;

import com.bugwolf.factory.functionfactory.car.Audi;
import com.bugwolf.factory.functionfactory.car.Car;

public class AudiFactory implements Factory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
