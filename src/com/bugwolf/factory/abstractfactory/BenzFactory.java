package com.bugwolf.factory.abstractfactory;

import com.bugwolf.factory.Benz;
import com.bugwolf.factory.Car;
import com.bugwolf.factory.functionfactory.Factory;

public class BenzFactory extends AbstractFactory{
    @Override
    public Car getCar() {
        return new Benz();
    }
}
