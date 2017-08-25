package com.selenium.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Example 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.com/");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a/span"));
		Actions act=new Actions(driver);
		act.moveToElement(we).build().perform();
	}

}
