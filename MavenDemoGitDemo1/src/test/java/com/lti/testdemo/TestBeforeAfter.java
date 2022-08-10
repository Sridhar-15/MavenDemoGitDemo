package com.lti.testdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class TestBeforeAfter {
	
	Calculator c = new Calculator();
	int sum =0;
	
	@BeforeAll // only once before all the test case
	public static void testStartDbCon() {
		System.out.println("DB Conn is up - only once");
	}
	
	@AfterAll
	public static void testShutDbCon() {
		System.out.println("DB Conn is shut down - only once");
	}
	
	
	@BeforeEach // before each test case
	public void testStartup() {
		sum = 0;
		System.out.println("Sum is 0 " +sum);
		
	}
	
	@AfterEach
	public void testShutDown() {
		//sum = 0;
		System.out.println("Sum is null");
		
	}
	
	@Test
	public void testaddNos() {
		Assertions.assertEquals(30,c.addNos(20,10));
	}
	
	@Test
	public void testsubNos() {
		Assertions.assertEquals(-10,c.subNos(10,20));
		//Assertions.assertEquals(10,c.subNos(10,20),"plz check subraction code");
	}
}
