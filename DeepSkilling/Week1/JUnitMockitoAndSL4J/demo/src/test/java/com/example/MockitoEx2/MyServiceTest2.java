package com.example.MockitoEx2;

import com.example.MockitoEx1.ExternalApi;
import com.example.MockitoEx1.MyService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest2 {

    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}