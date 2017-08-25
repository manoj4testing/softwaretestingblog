package com.selenium.TestNG;

import org.testng.annotations.Test;

public class AlwaysRunExample 
{
	@Test(alwaysRun=true)
	public void method1()
	{
		System.out.println("Inside Method 1");
	}
	@Test(alwaysRun=false)
	public void method2()
	{
		System.out.println("Inside Method 1");
	}

}
