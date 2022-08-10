package com.lti.testdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class CalculatorTests {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	Calculator c = new Calculator();
	
	@Disabled
	@Test
	public void testSayHello() {
		Assertions.assertEquals("Hello world",c.sayHello());
	}
	
	@Disabled
	@Test
	public void testaddNos() {
		Assertions.assertEquals(30,c.addNos(20,10));
	}
	
	@Test
	public void testsubNos() {
		Assertions.assertEquals(-10,c.subNos(10,20));
		//Assertions.assertEquals(10,c.subNos(10,20),"plz check subraction code");
	}
	
	@Test
	public void testAssertNulls() {
		String s1 = null;
		String s2 = "Sri";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("sumit".length()== 10);
		Assertions.assertFalse(10>20, "10 is smaller");
		Assertions.assertNotEquals("Hello", "hello");
		
	}
	
	@Test
	public void testArrays() {
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(2);
		
		Assertions.assertEquals(2, myList.size());
		
	}

}
