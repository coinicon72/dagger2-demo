package com.universal.demo.di;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * Created by swm on 2018-5-12
 */
public class ElectronicEngine implements Engine {
    private static final Logger logger = LoggerFactory.getLogger(ElectronicEngine.class);

    @Inject
    public ElectronicEngine() {}

    @Override
    public void start() {
        logger.info("start");
    }

    @Override
    public void stop() {
        logger.info("stop");
    }
}
