package com.example.AdvJUnitEx4;

public class ExceptionThrower {

    public void throwException(boolean flag) {
        if (flag) {
            throw new IllegalArgumentException("Exception thrown");
        }
    }
}