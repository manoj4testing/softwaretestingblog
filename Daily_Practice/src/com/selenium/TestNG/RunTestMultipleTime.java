package com.selenium.TestNG;

import org.testng.annotations.Test;

public class RunTestMultipleTime 
{
	@Test(invocationCount=10)
	public void display()
	{
		System.out.println("Manoj");
	}
	
	@Test
	public void display1()
	{
		System.out.println("Manoj1");
	}

}
