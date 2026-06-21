package com.example.MockitoEx6;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;

public class OrderTest {

    @Test
    void testOrder() {

        List<String> mockList = mock(List.class);

        mockList.add("A");
        mockList.add("B");

        InOrder inOrder = inOrder(mockList);
        inOrder.verify(mockList).add("A");
        inOrder.verify(mockList).add("B");
    }
}