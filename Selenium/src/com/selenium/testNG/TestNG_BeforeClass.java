package com.selenium.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_BeforeClass 
{
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("Browser Opened");
	}
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

	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("Browser Closed");
	}

}
