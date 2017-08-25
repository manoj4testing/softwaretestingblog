package com.selenium.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.selenium.TestNG.TestNGListeners.class)
public class TestNgUseonclassLevel 
{
	@Test
	public void verifytitle()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
