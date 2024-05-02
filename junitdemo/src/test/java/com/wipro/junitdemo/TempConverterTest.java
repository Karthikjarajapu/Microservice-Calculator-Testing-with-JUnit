package com.wipro.junitdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TempConverterTest {

    @Test
    void testFahrenheitToCentigrade() {
        TempConverter converter = new TempConverter();
        
        // Test with freezing point of water in Fahrenheit (32°F)
        double fahrenheitValue = 32.0;
        double expectedCelsiusValue = 0.0;
        double actualCelsiusValue = converter.farenheitToCentigrade(fahrenheitValue);
        
        assertEquals(expectedCelsiusValue, actualCelsiusValue,0.001); // Delta is the acceptable difference
    }
}
