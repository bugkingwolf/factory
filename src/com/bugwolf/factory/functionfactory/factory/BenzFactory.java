package com.bugwolf.factory.functionfactory.factory;

import com.bugwolf.factory.functionfactory.car.Benz;
import com.bugwolf.factory.functionfactory.car.Car;

public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
