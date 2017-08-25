package com.selenium.robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToFB 
{
	WebDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);

	}

	@Test
	public void operation() throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("deejaysdrive@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("badyear@2012");
		Robot r=new Robot();
		r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.close();
	}

}
