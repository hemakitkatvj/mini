package com.testng;

import org.testng.annotations.Test;

public class Exception {
	
	
	@Test(expectedExceptions = ArithmeticException.class) 
	private void amethod() {
		
		int a  = 5/0 ;
		System.out.println("A METHOD");

	}
	@Test
	public void bmethod() {
		System.out.println("B METHOD");

	}
	

	
	
}
