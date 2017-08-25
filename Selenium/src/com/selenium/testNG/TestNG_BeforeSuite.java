package com.selenium.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_BeforeSuite 
{
	@BeforeClass
	public void login()
	{
		System.out.println("Login Sucessfully");
	}
	@Test
	public void operation()
	{
		System.out.println("Openration Done");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("Logout Sucessfully");
	}

}
