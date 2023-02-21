package com.testng;

import org.testng.annotations.Test;

public class Invocationcount {
	@Test(invocationCount = 4)      // Invocation is added to run the amethod 4 times
	public  void amethod() {
		System.out.println("A METHOD");

	}
	@Test
	public void bmethod() {
		System.out.println("B METHOD");

	}
	

}
