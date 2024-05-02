package com.wipro.junitdemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.*;

class ShopCartTest {
	List<String> items = null;

	@BeforeEach
	void setUp() {
		items = new ArrayList();
		items.add("Laptop");
		items.add("Mobile");
		items.add("TV");
	}

	@AfterEach
	void tearDown() {
		items = null;

	}

	@Test
	void test() {
		ICart cart = Mockito.mock(ICart.class);
		when(cart.getItems()).thenReturn(items);
		assertTrue(cart.getItems().size() == 3);
	}

	@Test
	void checkFirstItem() {
		ICart cart = Mockito.mock(ICart.class);
		when(cart.getItems()).thenReturn(items);
//System.out.println(cart.getItems().get(0));
		assertEquals(cart.getItems().get(0), "Laptop");

	}

}