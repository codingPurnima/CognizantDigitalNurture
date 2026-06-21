package com.example.springtest;

import com.example.springtest.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void testAdd() {
        CalculatorService service = new CalculatorService();
        assertEquals(5, service.add(2, 3));
    }
}