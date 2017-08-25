package com.selenium.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactoryExample 
{
	@Test
	public void a()
	{
		System.out.println("Inside A Methods");
	}
	
	@Test
	public void c()
	{
		System.out.println("Inside C Methods");
	}
	@Test
	public void b()
	{
		System.out.println("Inside B Methods");
	}
	@Test
	public void a0()
	{
		System.out.println("Inside A0 Methods");
	}
	@BeforeTest
	public void cc()
	{
		System.out.println("--------------Before Method----------------");
	}
	@AfterTest
	public void DD()
	{
		System.out.println("--------------After Method----------------");
	}

}
