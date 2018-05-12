package com.universal.demo.di;

/**
 * Created by swm on 2018-5-12
 */
public class Main {

    public static void main(String[] args) {
        ShipFactory factory = DaggerShipFactory.builder().build();
        Ship shipA = factory.make();
        shipA.engine.start();

//        Ship shipB = factory.make();
//        shipB.engine.start();
    }
}
