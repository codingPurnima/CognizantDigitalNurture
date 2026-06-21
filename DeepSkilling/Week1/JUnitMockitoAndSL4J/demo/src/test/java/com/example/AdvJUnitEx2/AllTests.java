package com.example.AdvJUnitEx2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        ClassATest.class,
        ClassBTest.class
})
public class AllTests {
}