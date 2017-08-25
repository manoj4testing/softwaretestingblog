package com.selenium.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop 
{
	WebDriver driver=new FirefoxDriver();
	Actions act=new Actions(driver);
	@BeforeTest
	public void openwebsite()
	{
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	}
	@Test
	public void operation() throws InterruptedException
	{
		Actions act=new Actions(driver);
		WebElement Source=driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement Destination=driver.findElement(By.xpath(".//*[@id='droppable']"));
		act.dragAndDrop(Source, Destination).build().perform();
		
	}
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
