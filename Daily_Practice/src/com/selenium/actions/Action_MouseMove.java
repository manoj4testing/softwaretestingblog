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

public class Action_MouseMove 
{
	/* Some Time You Got WebDriverException: Permission Denied When Ur Browser is not Compatible*/
	
	WebDriver driver=new FirefoxDriver();
	Actions act=new Actions(driver);
	@BeforeTest
	public void openwebsite()
	{
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	}
	@Test
	public void operation() throws InterruptedException
	{
		driver.findElement(By.name("txtUserName")).clear();
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("user1");
		driver.findElement(By.name("Submit")).click();
		WebElement Element=driver.findElement(By.xpath(".//*[@id='leave']/a/span"));
		Actions act=new Actions(driver);
		act.moveToElement(Element).build().perform();;
		WebElement Element2=driver.findElement(By.xpath(".//*[@id='leave']/ul/li[3]/a/span"));
		act.moveToElement(Element2).build().perform();
		
	}
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.close();
	}

}
