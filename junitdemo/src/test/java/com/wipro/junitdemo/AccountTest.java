package com.wipro.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	Account a = null;

	@BeforeEach
	void setUp() {
		a = new Account(1000);

	}

	@Test
	void withdrawTest() {
		a.withdraw(100);
		double bal = a.getBalance();
		Assertions.assertTrue(bal == 900);
	}

	@Test
	void depositTest() {
		a.deposit(200);
		double bal = a.getBalance();
		Assertions.assertTrue(bal == 1200);
	}
}