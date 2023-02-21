package com.testng;

import org.testng.annotations.Test;

public class TimeOut {
	
	@Test(timeOut = 1000)  // if time exided it shows exceptions
	public void cmethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("C METHOD");

	}
	@Test
	public void dmethod() {
		System.out.println("D METHOD");

	}

}
