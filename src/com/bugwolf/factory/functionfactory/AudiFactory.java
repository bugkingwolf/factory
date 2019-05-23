package com.bugwolf.factory.functionfactory;

import com.bugwolf.factory.Audi;
import com.bugwolf.factory.Car;

public class AudiFactory implements Factory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
