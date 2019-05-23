package com.bugwolf.factory.simplefactory;

public class MainTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getCar("Audi"));
    }
}
