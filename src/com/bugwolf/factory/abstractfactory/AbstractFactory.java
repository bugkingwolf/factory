package com.bugwolf.factory.abstractfactory;

import com.bugwolf.factory.Audi;
import com.bugwolf.factory.BWM;
import com.bugwolf.factory.Benz;
import com.bugwolf.factory.Car;

public abstract  class AbstractFactory {

    abstract Car getCar();

    public Car getCar(String name){
        if ("Audi".equals(name)){
            return  new Audi();
        }else if("BMW".equals(name)){
            return  new BWM();
        }else if("Benz".equals(name)){
            return  new Benz();
        }
        return null;
    }
}
