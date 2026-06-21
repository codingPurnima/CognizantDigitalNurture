package com.example.MockitoEx3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class ArgumentMatcherTest {

    @Test
    void testArgumentMatching() {

        List<String> mockList = mock(List.class);

        mockList.add("Java");

        verify(mockList).add(eq("Java"));
    }
}