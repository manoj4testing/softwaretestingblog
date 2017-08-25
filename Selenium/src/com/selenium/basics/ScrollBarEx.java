package com.selenium.basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBarEx 
{
	@org.testng.annotations.Test
	public void scroll() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();		
		driver.get("http://odishaportals.in/");		 
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    jse.executeScript("scroll(0,550)");
	    Thread.sleep(5000);
	    driver.close();
	}
}
