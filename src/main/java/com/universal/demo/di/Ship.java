package com.universal.demo.di;

import javax.inject.Inject;

/**
 * Created by swm on 2018-5-12
 */

// 1
public class Ship {
    @Inject
    ElectronicEngine engine;

    @Inject
    public Ship() {
    }
}


// 2
//public class Ship {
//    @Inject
//    ElectronicEngine engine;
//
//    @Inject
//    String name;
//
//    @Inject
//    public Ship() {
//    }
//}


// 3
//public class Ship {
//    ElectronicEngine engine;
//
//    String name;
//
//    @Inject
//    public Ship(String shipName, ElectronicEngine engine) {
//        this.engine = engine;
//        this.name = shipName;
//    }
//}
