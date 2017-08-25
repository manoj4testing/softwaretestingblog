package com.selenium.testNG;

import org.testng.annotations.Test;

public class InvocationCountRun 
{
	@Test(invocationCount=10)
	public void show()
	{
		System.out.println("Hi");
	}
	@Test(invocationCount=10)
	public void show1()
	{
		System.out.println("Hi 1");
	}

}
