package com.selenium.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.selenium.TestNG.ListenerMain.class)
public class Listener_TestlistenerEx 
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
