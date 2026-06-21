package com.example.MockitoEx4;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class VoidServiceTest {

    @Test
    void testVoidMethod() {

        VoidService mockService = mock(VoidService.class);

        doNothing().when(mockService).save("test");

        mockService.save("test");

        verify(mockService).save("test");
    }
}