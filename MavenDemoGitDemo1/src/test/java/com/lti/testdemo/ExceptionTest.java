package com.lti.testdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class ExceptionTest {

	
	// developer writes exception - junit checks whether those exception are handleded or not
	@Test
	void testException() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> {Integer.parseInt("One"); } );
				
	}
	
	@Test
	public void tempmethodExp() {
		Calculator c = new Calculator();
		final Exception e = assertThrows(ArithmeticException.class,
								() ->  {c.searchEmp(0); });
		
		Assertions.assertEquals("u entered 0", e.getMessage());
	}

}
