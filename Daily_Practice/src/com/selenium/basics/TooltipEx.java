package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TooltipEx 
{
	WebDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		
	}
	@Test
	public void operation()
	{
		driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys("o");
		String str=driver.findElement(By.xpath("html/body/div[3]")).getText();
		System.out.println(str);
	}

}