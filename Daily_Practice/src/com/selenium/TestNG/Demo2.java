package com.selenium.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Demo2 
{
	@BeforeClass
	public void class1()
	{
		System.out.println("Before Class 1");
	}
	@AfterClass
	public void class2()
	{
		System.out.println("After Class 2");
	}
	@Test
	public void demo2()
	{
		System.out.println("Demo2Test");
	}
	
	

}

