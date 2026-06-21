package com.example.MockitoEx7;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ExceptionTest {

    @Test
    void testVoidException() {

        VoidService mockService = mock(VoidService.class);

        doThrow(new RuntimeException("Error"))
                .when(mockService).save("fail");

        try {
            mockService.save("fail");
        } catch (Exception e) {
            // expected
        }

        verify(mockService).save("fail");
    }
}