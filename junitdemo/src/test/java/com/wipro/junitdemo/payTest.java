package com.wipro.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class payTest {

    @Test
    void testPayment() {
        IPayment mockPayment = mock(IPayment.class);
        when(mockPayment.pay()).thenReturn("Payment done");
        String result = mockPayment.pay();
        assertEquals("Payment done", result);
    }
}
