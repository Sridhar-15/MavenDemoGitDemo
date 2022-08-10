package com.lti.demo;

public class TestCalculator {

	public static void main(String[] args) {
	
		Calculator c = new 	Calculator();
		String msg = c.sayHello();
		System.out.println(msg);
		
		int sum = c.addNos(200, 256);
		System.out.println(sum);

	}

}
