package com.testng;

import org.testng.annotations.Test;

public class Priority_Testng {
	
	@Test(priority = 4)
	private void amethod() {
		System.out.println("A METHOD");

	}
	@Test(priority = 3)
	public void bmethod() {
		System.out.println("B METHOD");

	}
	@Test(priority = 2)
	public void cmethod() {
		System.out.println("C METHOD");

	}
	@Test(priority = 1)
	public void dmethod() {
		System.out.println("D METHOD");

	}

}
