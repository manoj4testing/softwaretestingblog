package com.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action_ContextClick 
{
	WebDriver driver=new FirefoxDriver();
	Actions act=new Actions(driver);
	@BeforeTest
	public void openwebsite()
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	}
	@Test
	public void operation() throws InterruptedException
	{
		WebElement Element=driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		act=new Actions(driver);
		act.moveToElement(Element).build().perform();
		Thread.sleep(5000);
		act.click().build().perform();
		
	}
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.close();
	}

}
