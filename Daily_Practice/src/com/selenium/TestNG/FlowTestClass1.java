package com.selenium.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlowTestClass1 
{
	@BeforeTest
	public void beforetest2()
	{
		System.out.println("Class 1 Before Test");
	}
	@BeforeClass
	public void beforeclass1()
	{
		System.out.println("Class 1 Before Class");
	}
	@BeforeMethod
	public void beforemethod1()
	{
		System.out.println("Class 1 Before Method");
	}
	@Test
	public void class1test1()
	{
		System.out.println("Inside Class 1 Test1");
	}
	@Test
	public void class1test2()
	{
		System.out.println("Inside Class 1 Test2");
	}@AfterClass
	public void Afterclass1()
	{
		System.out.println("Class 1 After Class");
	}
	

}