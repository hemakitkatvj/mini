package com.testng;

import org.testng.annotations.Test;

public class Parallel {
	@Test
	private void amethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("A METHOD");

	}
	@Test
	public void bmethod() throws InterruptedException {
		Thread.sleep(1000);
		
		System.out.println("B METHOD");

	}
	

}
