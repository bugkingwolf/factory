package com.bugwolf.factory.functionfactory;

import com.bugwolf.factory.Benz;
import com.bugwolf.factory.Car;

public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
