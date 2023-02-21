package com.testng;

import org.testng.annotations.Test;

public class Ignore {
	
	@org.testng.annotations.Ignore
	@Test
	public void amethod() {
		System.out.println("A METHOD");

	}
	@Test(enabled = false)
	public void bmethod() {
		System.out.println("B METHOD");

	}
	@Test
	public void cmethod() {
		System.out.println("C METHOD");

	}
	@Test
	public void dmethod() {
		System.out.println("D METHOD");

	}
	

}
