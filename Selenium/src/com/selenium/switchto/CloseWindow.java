package com.selenium.switchto;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CloseWindow 
{
	WebDriver driver=new FirefoxDriver();

	@BeforeTest
	public void open()
	{
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/frames-and-windows/");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);


	}

	@Test
	public void operation() throws InterruptedException
	{
		//String parent=driver.getWindowHandle();
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		Thread.sleep(2000);
		Set<String> handles=driver.getWindowHandles();
		
		for(String h:handles)
		{
			driver.switchTo().window(h);
			driver.close();
		}
		//driver.switchTo().window(parent);
		//driver.close();
	}

}
