package com.testng;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "smoketest1")
	private void amethod() {
		System.out.println("A METHOD");

	}
	@Test(groups = "smoketest2")
	public void bmethod() {
		System.out.println("B METHOD");

	}
	@Test(groups = "smoketest2")
	public void cmethod() {
		System.out.println("C METHOD");

	}
	@Test(groups = {"smoketest1" , "smoketest2"})       //( groups = {"name1","name2"} )
	public void dmethod() {
		System.out.println("D METHOD");

	}

}
