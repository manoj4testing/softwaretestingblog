package com.selenium.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Demo4 
{
	@BeforeTest
	public void class11()
	{
		System.out.println("Before Test 11");
	}
	@AfterTest
	public void class22()
	{
		System.out.println("After Test 22");
	}
	@Test
	public void demo2()
	{
		System.out.println("Demo4Test");
	}
	
	

}

