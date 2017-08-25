package com.selenium.switchto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Switchto_Alert 
{
	WebDriver driver=new FirefoxDriver();
	@BeforeTest
	public void openwebsite()
	{
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void operation()
	{
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Manoj");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("7ksjdfk");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
	}
	@Test(priority=2)
	public void handlealert()
	{
		if(ExpectedConditions.alertIsPresent() != null)
			driver.switchTo().alert().accept();
		else
			System.out.println("There Is No Alert");
			
	}
	
	@Test
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
