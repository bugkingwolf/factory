package com.bugwolf.factory.functionfactory;

public class MainTest {
    public static void main(String[] args) {
        //Audi
        AudiFactory audiFactory = new AudiFactory();
        System.out.println(audiFactory.getCar().getCar());

        //BWM
        BMWFactory bmwFactory = new BMWFactory();
        System.out.println(bmwFactory.getCar().getCar());

        //Benz
        BenzFactory benzFactory = new BenzFactory();
        System.out.println(benzFactory.getCar().getCar());

    }
}
