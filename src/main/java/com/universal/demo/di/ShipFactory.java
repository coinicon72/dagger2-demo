package com.universal.demo.di;

import dagger.Component;

/**
 * Created by swm on 2018-5-12
 */

// 1
@Component
public interface ShipFactory {
    Ship make();
}

// 2, 3
//@Component(modules = ShipModule.class)
//public interface ShipFactory {
//    Ship make();
//}
