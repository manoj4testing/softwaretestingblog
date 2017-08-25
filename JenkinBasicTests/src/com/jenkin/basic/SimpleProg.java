package com.jenkin.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleProg 
{
	@Test
	public void open()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		String actual=driver.getTitle();
		String expected="Google";
		Assert.assertEquals(actual, expected);
		//Assert.assertTrue(driver.getTitle().contains("Google"));
		System.out.println("Operation Sucessfull");
		driver.close();
	}

}
