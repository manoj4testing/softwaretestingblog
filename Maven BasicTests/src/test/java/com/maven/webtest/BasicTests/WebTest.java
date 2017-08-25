package com.maven.webtest.BasicTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest 
{
	@Test
	public void test()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Assert.assertTrue(driver.getTitle().contains("Google"));
		driver.close();
	}
}
