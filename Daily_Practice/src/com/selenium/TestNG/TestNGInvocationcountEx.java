package com.selenium.TestNG;

import org.testng.annotations.Test;

public class TestNGInvocationcountEx 
{
	@Test(invocationCount=5)
	public void test()
	{
		
		System.out.println("The Value Of I");
		
	}
	
}
