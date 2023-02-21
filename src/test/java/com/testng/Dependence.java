package com.testng;

import org.testng.annotations.Test;

public class Dependence {
	
	@Test
	private void amethod() {
		int a = 5/0;  // it fail the method so the depented method b and c will be skiped the dmethod only run  , if not it will run
		System.out.println("A METHOD");

	}
	@Test(dependsOnMethods = "amethod")
	public void bmethod() {
		System.out.println("B METHOD");

	}
	@Test(dependsOnMethods = "bmethod")
	public void cmethod() {
		System.out.println("C METHOD");

	}
	@Test()
	public void dmethod() {
		System.out.println("D METHOD");

	}

}
