package com.selenium.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_BeforeTest 
{
	@BeforeTest
	public void login()
	{
		System.out.println("Login Sucessfully");
	}
	@Test
	public void operation()
	{
		System.out.println("Openration Done");
	}
	@AfterTest
	public void logout()
	{
		System.out.println("Logout Sucessfully");
	}

}
