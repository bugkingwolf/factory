package com.bugwolf.factory.functionfactory.factory;

import com.bugwolf.factory.functionfactory.car.BWM;
import com.bugwolf.factory.functionfactory.car.Car;

public class BMWFactory implements Factory {
    @Override
    public Car getCar() {
        return new BWM();
    }
}
