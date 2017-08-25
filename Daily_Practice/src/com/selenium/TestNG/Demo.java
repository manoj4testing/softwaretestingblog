package com.selenium.TestNG;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Demo 
{
	@BeforeTest
	public void  Show1()
	{
		System.out.println("Inside 1");
	}
	@BeforeClass
	public void  Show2()
	{
		System.out.println("Inside 2");
	}
	@Test
	public void  Show3()
	{
		System.out.println("Inside 3");
	}
	

}

