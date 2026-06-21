package com.example.AdvMockitoEx5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MultiReturnServiceTest {

    @Test
    public void testServiceWithMultipleReturnValues() {

        Repository repo = mock(Repository.class);

        when(repo.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        Service service = new Service(repo);

        String first = service.processData();
        String second = service.processData();

        assertEquals("Processed First Mock Data", first);
        assertEquals("Processed Second Mock Data", second);
    }
}