package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.debug("Debug message - useful for developers");
        logger.info("Application started successfully");
        logger.warn("Low memory warning");
        logger.error("Something critical failed");
    }
}