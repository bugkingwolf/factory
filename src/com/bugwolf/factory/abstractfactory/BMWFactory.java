package com.bugwolf.factory.abstractfactory;

import com.bugwolf.factory.BWM;
import com.bugwolf.factory.Car;
import com.bugwolf.factory.functionfactory.Factory;

public class BMWFactory extends AbstractFactory{
    @Override
    public Car getCar() {
        return new BWM();
    }
}
