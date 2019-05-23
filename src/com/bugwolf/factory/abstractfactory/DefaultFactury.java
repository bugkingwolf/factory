package com.bugwolf.factory.abstractfactory;

import com.bugwolf.factory.Car;

public class DefaultFactury extends  AbstractFactory{


    @Override
    Car getCar() {
        //默认产Audi
        return new AudiFactory().getCar();
    }
}
