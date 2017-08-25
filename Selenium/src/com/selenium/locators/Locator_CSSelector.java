package com.selenium.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locator_CSSelector 
{
	WebDriver driver=new FirefoxDriver();

	@BeforeTest
	public void openwebsite()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	}

	@Test
	public void login()
	{
		driver.findElement(By.cssSelector("input[id=txtUsername]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id^='txtPass']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name$='Submit']")).click();
	}
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
