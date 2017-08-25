package com.selenium.testNG;

import org.testng.annotations.Test;

public class TestNg_ExpectedException 
{
	@Test (expectedExceptions=ArithmeticException.class)
	public void show()
	{
		//System.out.println("Hi Method");
		int a=10/0;
		System.out.println(a);
	}

}
