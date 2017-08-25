package com.selenium.testNG;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Simpletest 
{
	@BeforeTest
	public void beforeTest0()
	{
		System.out.println("Class 2 Before Test");
	}
	@Test
	public void beforeClass2()
	{
		System.out.println("Class 2 Before Class");
	}
	@Test
	public void class2test1()
	{
		System.out.println("Class 2 Test1");
	}
	@Test
	public void AfterClass()
	{
		System.out.println("Class 2 After Class");
	}
	@Test
	public void aftertest()
	{
		System.out.println("Inside Class2 After Test");
	}

}