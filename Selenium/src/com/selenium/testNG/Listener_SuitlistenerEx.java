package com.selenium.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Listener_SuitlistenerEx 
{
	@Test
	public void login() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.close();
	}

}
