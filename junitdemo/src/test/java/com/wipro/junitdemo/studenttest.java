package com.wipro.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class studenttest {
	
	@BeforeAll
	void beginStart()
	{
	System.out.println("--Before All--");
	}

	@AfterAll
	void end()
	{
	System.out.println("--After All--");
	}
	
	@BeforeEach
	void setUp()
	{
	System.out.println("--Before Each--");
	student stud=new student(null, 0);

	}

	@AfterEach
	void tearDown()
	{
	System.out.println("--After Each--");
	student stud=null;
	}

    @Test
    public void testName() {
    	System.out.println("Karthik");
        student student = new student("Karthik", 101);
        assertEquals("Karthik", student.getName());
    }

    @Test
    public void testRollNumber() {
    	System.out.println("101");
        student student = new student("Karthik", 101);
        assertEquals(101, student.getRollNumber());
    }
}
