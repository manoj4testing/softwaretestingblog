package com.selenium.TestNG;

import org.testng.annotations.Test;

public class TestNGexpectedExpection 
{
	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionWithException() {
		System.out.println("The Message");
		int i = 1 / 0;
		System.out.println(i);
		
	}

}
