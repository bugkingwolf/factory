package com.bugwolf.factory.abstractfactory;

import com.bugwolf.factory.Car;

public class MainTest {
    public static void main(String[] args) {
        Car car = new AbstractFactory() {

            @Override
            Car getCar() {
                return null;
            }
        }.getCar("Audi");
        System.out.println(car.getCar());

        DefaultFactury defaultFactury = new DefaultFactury();
        System.out.println(defaultFactury.getCar().getCar());
        System.out.println(defaultFactury.getCar("Audi").getCar());
        System.out.println(defaultFactury.getCar("BMW").getCar());
        System.out.println(defaultFactury.getCar("Benz").getCar());

    }
}
