package com.bugwolf.factory.abstractfactory;

import com.bugwolf.factory.abstractfactory.audi.AudiFactory;
import com.bugwolf.factory.abstractfactory.factory.BmwFactory;

public class MainTest {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        System.out.println(audiFactory.productBusinessCar().getCar());
        System.out.println(audiFactory.productSportCar().getCar());
//        audiFactory.productBusinessCar();
//        audiFactory.productSportCar();

        BmwFactory bmwFactory = new BmwFactory();
        System.out.println(bmwFactory.productBusinessCar().getCar());
        System.out.println(bmwFactory.productSportCar().getCar());
//        bmwFactory.productBusinessCar();
//        bmwFactory.productSportCar();
    }
}
