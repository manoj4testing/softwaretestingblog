package com.selenium.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locator_Xpath 
{
	WebDriver driver=new FirefoxDriver();

	@BeforeTest
	public void openwebsite()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	}

	@Test
	public void login()
	{
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@id,'txtPassword')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@name,'Submit')]")).click();
	}
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
