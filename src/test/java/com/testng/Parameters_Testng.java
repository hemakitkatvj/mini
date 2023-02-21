package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Testng {
	@Parameters({"user"})
	@Test
	public  void amethod(String username) {
		System.out.println("username is :"  + username);

	}
	@Parameters({"pass"})
	@Test
	public void bmethod(String password) {
		System.out.println("password is :" + password);

	}

}
