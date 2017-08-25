package com.selenium.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ImplicityWaitEx 
{
	@Test
	public void operation()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(500000, TimeUnit.SECONDS);
		driver.close();
	}

}
