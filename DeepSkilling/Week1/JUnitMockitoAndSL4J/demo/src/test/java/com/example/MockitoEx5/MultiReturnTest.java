package com.example.MockitoEx5;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MultiReturnTest {

    @Test
    void testMultipleReturns() {

        Iterator<String> mockIterator = mock(Iterator.class);

        when(mockIterator.next())
                .thenReturn("First")
                .thenReturn("Second");

        assertEquals("First", mockIterator.next());
        assertEquals("Second", mockIterator.next());
    }
}