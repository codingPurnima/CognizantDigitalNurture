package com.example.AdvMockitoEx4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NetworkServiceTest {

    @Test
    public void testServiceWithMockNetworkClient() {

        NetworkClient client = mock(NetworkClient.class);
        when(client.connect()).thenReturn("Mock Connection");

        NetworkService service = new NetworkService(client);

        String result = service.connectToServer();

        assertEquals("Connected to Mock Connection", result);
    }
}