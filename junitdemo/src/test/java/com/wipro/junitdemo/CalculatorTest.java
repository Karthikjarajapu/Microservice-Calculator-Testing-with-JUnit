package com.wipro.junitdemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	@Mock
	CalculatorService calculatorService = Mockito.mock(CalculatorService.class);

	@Test
	public void testAdd() {
		Mockito.when(calculatorService.add(2, 3)).thenReturn(5);
		assertEquals(5, calculatorService.add(2, 3));
	}

	@Test
	public void testMultiply() {
		Mockito.when(calculatorService.multiply(2, 3)).thenReturn(6);
		assertEquals(6, calculatorService.multiply(2, 3));
	}

	@Test
	public void testSub() {
		Mockito.when(calculatorService.sub(5, 3)).thenReturn(2);
		assertEquals(2, calculatorService.sub(5, 3));
	}

	@Test
	public void testDivide() {
		Mockito.when(calculatorService.divide(10.0, 2.0)).thenReturn(5.0);
		assertEquals(5.0, calculatorService.divide(10.0, 2.0));
	}
}