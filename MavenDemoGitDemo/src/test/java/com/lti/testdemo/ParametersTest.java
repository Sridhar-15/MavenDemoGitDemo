package com.lti.testdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {
	
	
	@ParameterizedTest
	@ValueSource(ints = {8,10,12,34,88})
	public void testIntArrayParam(int a) {
		System.out.println("a :" + a);
		Assertions.assertTrue(a%2 == 0);
	}
	
	@DisplayName("should pass test case if all param are not null")
	@ParameterizedTest
	@ValueSource(strings = {"hello","hi","world"})
	public void testStringParam(String msg) {
		Assertions.assertNotNull(msg);
	}
	
	@Test
	public void testLambdaSupport() {
		Integer[] intArr = {10,20,25,14};
		List<Integer> intList = Arrays.asList(intArr);
		Assertions.assertAll(
				() -> assertEquals(10,intList.get(0)), // checking the value of intList
				() -> assertEquals(20,intList.get(1)),
				() -> assertEquals(25,intList.get(2)),
				() -> assertEquals(14,intList.get(3)),
				//() -> assertNull(intList.get(0))
				() -> assertNull(null)
				);
		
	}
	
	@RepeatedTest(value = 3, name =" repeat 3 times")
	public void repeatTest() {
		int a =10,b=20;
		Assertions.assertEquals(200, (a*b));
	}
}
