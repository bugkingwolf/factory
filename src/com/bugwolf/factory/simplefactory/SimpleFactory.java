package com.bugwolf.factory.simplefactory;

import com.bugwolf.factory.Audi;
import com.bugwolf.factory.BWM;
import com.bugwolf.factory.Benz;
import com.bugwolf.factory.Car;

public class SimpleFactory {

    private Car car;

    public String getCar(String name){
            if("Audi".equals(name)){
                return new Audi().getCar();
            }else if("Bmw".equals(name)){
                return new BWM().getCar();
            }else if("Benz".equals(name)){
                return new Benz().getCar();
            }else {
                return "此产品无法生产";
            }
    }
}
