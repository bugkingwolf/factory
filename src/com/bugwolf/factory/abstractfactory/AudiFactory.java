package com.bugwolf.factory.abstractfactory;

import com.bugwolf.factory.Audi;
import com.bugwolf.factory.Car;
import com.bugwolf.factory.functionfactory.Factory;

public class AudiFactory extends AbstractFactory{
    @Override
    public Car getCar() {
        return new Audi();
    }
}
