package com.lti.demo;

public class Calculator {
	
	public String sayHello() {
		return "Hello world";
	}
	
	public int addNos(int a, int b) {
		int res = a + b;
		return res;
		
	}
	
	public int subNos(int a, int b) {
		int res = a - b;
		return res;
		
	}
	
	public void searchEmp(int eid) {
		if(eid ==0) {
			throw new ArithmeticException("u entered 0");
		}
		else {
			System.out.println("do something");
		}
	}

}
