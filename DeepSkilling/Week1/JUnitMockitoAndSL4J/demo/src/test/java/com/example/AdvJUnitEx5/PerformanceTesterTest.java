package com.example.AdvJUnitEx5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

public class PerformanceTesterTest {

    PerformanceTester tester = new PerformanceTester();

    @Test
    void testTimeout() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            tester.performTask();
        });
    }
}