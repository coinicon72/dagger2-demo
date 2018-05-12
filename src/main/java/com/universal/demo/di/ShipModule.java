package com.universal.demo.di;

import dagger.Module;
import dagger.Provides;

/**
 * Created by swm on 2018-5-12
 */

// 2, 3
@Module
public class ShipModule {
    @Provides
    public String shipName() {
        return "March";
    }
}
