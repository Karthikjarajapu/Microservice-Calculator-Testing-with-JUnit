package com.wipro.junitdemo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class calctest {
	
	@Order(1)
	@BeforeAll
	void beginStart()
	{
	System.out.println("--Before All--");
	}
	
	@Order(8)
	@AfterAll
	void end()
	{
	System.out.println("--After All--");
	}
	
	@Order(2)
	@BeforeEach
	void setUp()
	{
	System.out.println("--Before Each--");
	calculate calc=new calculate();

	}

	@Order(7)
	@AfterEach
	void tearDown()
	{
	System.out.println("--After Each--");
	calculate calc=null;
	}
	
	
	@Order(5)
	@Test
	void addTestPositive()
	{
	calculate calc=new calculate();
	int sum=calc.add(2, 3);
	Assertions.assertTrue(sum==5);
	System.out.println("--add pass--");

	}

	@Order(6)
	@Test
	void addTestNegative()
	{
	calculate calc=new calculate();
	int sum=calc.add(2, 3);
	Assertions.assertFalse(sum==15);
	System.out.println("--add fails--");

	}
	
	@Order(3)
	@Test
	void subTestPositive()
	{
	calculate calc=new calculate();
	int sub=calc.sub(2,3);
	Assertions.assertTrue(sub==-1);
	System.out.println("--sub pass--");
	}
	
	@Order(4)
	@Test
	void subTestNegative()
	{
	calculate calc=new calculate();
	int sub=calc.sub(2,3);
	Assertions.assertFalse(sub==20);
	System.out.println("--sub fails--");

	}
	@Test
	void sameStudentCheck() {
		student student1 = new student("Karthik",101);
		student student2 = new student("Veera",102);
		System.out.println(student1);
		System.out.println(student2);
		assertEquals(student1, student1);
	}
	
	@Test
	void validPerson()
	{

	student s=new student("Maya",24);
	Assertions.assertNotNull(s);

	}
	@Test
	void invalidPerson()
	{
	student s=null;
	Assertions.assertNull(s);
	}
}
