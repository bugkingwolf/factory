package com.bugwolf.factory.functionfactory;

import com.bugwolf.factory.BWM;
import com.bugwolf.factory.Car;

public class BMWFactory implements Factory {
    @Override
    public Car getCar() {
        return new BWM();
    }
}
