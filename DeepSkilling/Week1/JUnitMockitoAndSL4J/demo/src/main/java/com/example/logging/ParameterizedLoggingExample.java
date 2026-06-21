package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String user = "John";
        int age = 25;

        // ✅ Parameterized logging (BEST PRACTICE)
        logger.info("User logged in: {}, Age: {}", user, age);

        int orderId = 101;
        String status = "SUCCESS";

        logger.warn("Order processed - ID: {}, Status: {}", orderId, status);

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.error("Exception occurred while processing request", e);
        }
    }
}